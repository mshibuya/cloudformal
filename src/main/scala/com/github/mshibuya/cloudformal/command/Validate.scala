package com.github.mshibuya.cloudformal.command

import com.amazonaws.services.cloudformation.model.ValidateTemplateRequest
import com.github.mshibuya.cloudformal.Writer

import scala.util.Try

case object Validate extends Command {
  def execute(config: Config): Try[Unit] = {
    val client = config.cloudFormationClient
    val name = config.stackName.get
    val output = config.output

    for {
      stack <- loadStack(name)
      result <- Try {
        val request = new ValidateTemplateRequest()
        request.setTemplateBody(new Writer().write(stack)) // TODO: support upload to s3
        client.validateTemplate(request)
      }
      _ <- Try {
        System.out.println(s"Description: ${result.getDescription}")
        System.out.println(s"Parameters: ${result.getParameters}")
        System.out.println(s"Capabilities: ${result.getCapabilities}")
        System.out.println(s"CapabilitiesReason: ${result.getCapabilitiesReason}")
        System.out.println(s"DeclaredTransforms: ${result.getDeclaredTransforms}")
      }
    } yield ()
  }
}
