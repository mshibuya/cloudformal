package com.github.mshibuya.cloudformal.command

import java.io.PrintWriter

import com.amazonaws.services.cloudformation.model.GetTemplateRequest

import scala.util.Try

case object Get extends Command {
  def execute(config: Config): Try[Unit] = {
    val client = config.cloudFormationClient
    val name = config.stackName.get
    val output = config.output

    Try {
      val writer = output.fold(new PrintWriter(System.out))(f => new PrintWriter(f))
      try {
        val result = client.getTemplate(new GetTemplateRequest().withStackName(name))
        writer.write(result.getTemplateBody)
      } finally {
        output.fold(writer.flush())(_ => writer.close())
      }
    }
  }
}
