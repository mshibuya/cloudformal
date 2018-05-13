package com.github.mshibuya.cloudformal.command

import java.io.PrintWriter

import com.amazonaws.services.cloudformation.model.GetTemplateRequest

import scala.util.Try

case object Get extends Command {
  def execute(config: Config): Try[Unit] = {
    val client = config.cloudFormationClient
    val output = config.output

    loadStack(config.stackName.get).flatMap { stack =>
      Try {
        val writer = output.fold(new PrintWriter(System.out))(f => new PrintWriter(f))
        try {
          val result = client.getTemplate(new GetTemplateRequest().withStackName(stack.name))
          writer.write(result.getTemplateBody)
        } finally {
          output.fold(writer.flush())(_ => writer.close())
        }
      }
    }
  }
}
