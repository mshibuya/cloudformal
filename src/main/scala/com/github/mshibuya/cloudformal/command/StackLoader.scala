package com.github.mshibuya.cloudformal.command

import com.github.mshibuya.cloudformal.model.Stack

import scala.collection.JavaConverters._
import scala.util.matching.Regex

case class StackLoader(packagePrefix: String = "") {
  val reflections = new org.reflections.Reflections(packagePrefix)

  def stackClasses: Seq[Class[_ <: Stack]] = reflections.getSubTypesOf(classOf[Stack]).asScala.toSeq
  def stacks: Seq[Stack] = stackClasses.map(_.getField("MODULE$").get(classOf[Stack]).asInstanceOf[Stack])

  def findStacksBy(pattern: String): Seq[Stack] = stacks.filter { stack =>
    val compiled: Regex = pattern.split("\\*").map(Regex.quote).mkString(".*").r
    compiled.findFirstIn(stack.getClass.getName).isDefined ||
      compiled.findFirstIn(stack.name).isDefined
  }
}
