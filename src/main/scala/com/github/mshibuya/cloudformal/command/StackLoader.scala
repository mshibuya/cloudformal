package com.github.mshibuya.cloudformal.command

import com.github.mshibuya.cloudformal.model.Stack

import scala.collection.JavaConverters._
import scala.util.matching.Regex

case class StackLoader(packagePrefix: String = "") {
  private lazy val reflections = new org.reflections.Reflections(packagePrefix)

  def stackClasses: Seq[Class[_ <: Stack]] = reflections.getSubTypesOf(classOf[Stack]).asScala.toSeq

  import scala.reflect.runtime.{universe => ru}
  import scala.reflect.runtime.{currentMirror => cm}
  private lazy val universeMirror = ru.runtimeMirror(getClass.getClassLoader)

  def stacks: Seq[Stack] = {
    stackClasses.flatMap { s =>
      try {
        Some(universeMirror.reflectModule(cm.moduleSymbol(s)).instance.asInstanceOf[Stack])
      } catch {
        case e @ (_: ScalaReflectionException | _: ClassNotFoundException) => None
      }
    }
  }

  def findStacksBy(pattern: String): Seq[Stack] = stacks.filter { stack =>
    val fullyQualifiedClassName = stack.getClass.getName.replaceFirst("\\$$", "")
    val stackName = stack.name
    val compiled: Regex = s"^${pattern.split("\\*", -1).map(Regex.quote).mkString(".*")}$$".r

    compiled.findFirstIn(fullyQualifiedClassName).isDefined ||
      compiled.findFirstIn(stack.name).isDefined
  }
}
