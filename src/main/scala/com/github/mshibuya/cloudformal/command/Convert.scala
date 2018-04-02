package com.github.mshibuya.cloudformal.command

import com.github.mshibuya.cloudformal.Writer

import scala.util.Try

object Convert extends Command {
  def execute(name: String): Try[Unit] = {
    loadStack(name).map { stack =>
      println(new Writer().write(stack))
    }
  }
}
