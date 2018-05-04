package com.github.mshibuya.cloudformal.command

import com.github.mshibuya.cloudformal.model._

import scala.util.Try

abstract class Command {
  def loadStack(name: String): Try[Stack] = Try {
    val klass = Class.forName(s"${name}$$")
    klass.getField("MODULE$").get(classOf[Stack]).asInstanceOf[Stack]
  }

  def execute(config: Config): Try[Unit]
}
