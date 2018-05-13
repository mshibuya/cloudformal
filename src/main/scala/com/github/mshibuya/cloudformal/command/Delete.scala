package com.github.mshibuya.cloudformal.command

import com.amazonaws.services.cloudformation.model.DeleteStackRequest

import scala.util.Try

case object Delete extends Command {
  def execute(config: Config): Try[Unit] = {
    val client = config.cloudFormationClient

    loadStack(config.stackName.get).flatMap { stack =>
      val name = stack.name
      prompt(config, s"Deleting stack: $name. Are you sure?") {
        Try {
          val request = new DeleteStackRequest()
          request.setStackName(name)
          client.deleteStack(request)
          System.out.println(s"Initiated deletion of stack: ${name}")
        }
      }
    }
  }
}
