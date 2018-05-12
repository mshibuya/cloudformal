package com.github.mshibuya.cloudformal.command

import java.io.PrintWriter

import com.amazonaws.services.cloudformation.model.{DeleteStackRequest, GetTemplateRequest}

import scala.util.Try

case object Delete extends Command {
  def execute(config: Config): Try[Unit] = {
    val client = config.cloudFormationClient
    val name = loadStack(config.stackName.get).map(_.name).getOrElse(config.stackName.get)
    val output = config.output

    Try {
      val request = new DeleteStackRequest()
      request.setStackName(name)
      client.deleteStack(request)
      System.out.println(s"Initiated deletion of stack: ${name}")
    }
  }
}
