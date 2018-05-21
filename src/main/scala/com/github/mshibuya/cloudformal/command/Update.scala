package com.github.mshibuya.cloudformal.command

import com.amazonaws.services.cloudformation.model.UpdateStackRequest
import com.github.mshibuya.cloudformal.Writer

import scala.collection.JavaConverters._
import scala.util.Try

case object Update extends Command with ChangeSetOperation {
  def execute(config: Config): Try[Unit] = {
    val client = config.cloudFormationClient

    loadStack(config.stackName.get).flatMap { stack =>
      if (config.noChangeSet) {
        Try {
          val request = new UpdateStackRequest()
          request.setStackName(stack.name)
          request.setParameters(config.parameters.asJava)
          request.setTags(config.tags.asJava)
          request.setTemplateBody(new Writer().write(stack)) // TODO: support upload to s3
          client.updateStack(request)

          System.out.println(s"Initiated update of stack: ${stack.name}")
        }
      } else {
        reviewAndApplyChanges(config, "UPDATE")
      }
    }
  }
}
