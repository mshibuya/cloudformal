package com.github.mshibuya.cloudformal.command

import java.io.PrintWriter

import com.github.mshibuya.cloudformal.Writer

import scala.util.Try

case object Generate extends Command {
  def execute(config: Config): Try[Unit] = {
    val output = config.output

    loadStack(config.stackName.get).map { stack =>
      val writer = output.fold(new PrintWriter(System.out))(f => new PrintWriter(f))
      try {
        writer.write(new Writer().write(stack))
      } finally {
        output.fold(writer.flush())(_ => writer.close())
      }
    }
  }
}
