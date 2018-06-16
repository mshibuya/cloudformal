package com.github.mshibuya.cloudformal.command

import java.io.File

import scala.util.Try
import sys.process._

case object Diff extends Command {
  def execute(config: Config): Try[Unit] = {
    val currentTemplateFile = File.createTempFile("current-", ".json")
    val generatedTemplateFile = File.createTempFile("generated-", ".json")
    currentTemplateFile.deleteOnExit()
    generatedTemplateFile.deleteOnExit()

    for {
      _ <- Get.execute(config.copy(output = Some(currentTemplateFile)))
      _ <- Generate.execute(config.copy(output = Some(generatedTemplateFile)))
      _ <- Try {
        val commandLine = Seq(config.diffBackend, currentTemplateFile.getPath, generatedTemplateFile.getPath).mkString(" ")
        System.out.println(commandLine)
        commandLine !
      }
    } yield ()
  }
}
