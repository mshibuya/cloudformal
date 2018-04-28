package com.github.mshibuya.cloudformal.command

import java.io.{File, PrintWriter}

import com.github.mshibuya.cloudformal.Writer

import scala.util.Try

object Convert extends Command {
  def execute(name: String, output: Option[File]): Try[Unit] = {
    loadStack(name).map { stack =>
      val writer = output.fold(new PrintWriter(System.out))(f => new PrintWriter(f))
      try {
        writer.write(new Writer().write(stack))
      } finally {
        output.fold(writer.flush())(_ => writer.close())
      }
    }
  }
}
