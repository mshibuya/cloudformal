package com.github.mshibuya.cloudformal.command

import com.amazonaws.services.cloudformation.model.ValidateTemplateRequest
import com.github.mshibuya.cloudformal.Writer

import scala.util.Try

case object Validate extends Command {
  def execute(config: Config): Try[Unit] = {
    val client = config.cloudFormationClient

    for {
      stack <- loadStack(config.stackName.get)
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
