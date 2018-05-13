package com.github.mshibuya.cloudformal.command

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import com.amazonaws.services.cloudformation.model._
import com.github.mshibuya.cloudformal.Writer
import com.github.mshibuya.cloudformal.model.Stack

import scala.collection.JavaConverters._
import scala.util.{Success, Try}

trait ChangeSetOperation { self: Command =>
  def reviewAndApplyChanges(config: Config, changeSetType: String): Try[Unit] = {
    val name = config.stackName.get
    for {
      stack <- loadStack(name)
      changeSetName: String = s"${stack.name}-${LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))}"
      createResult <- createChangeSet(config, stack, changeSetName, changeSetType)
      describeResult <- waitForChangeSet(config, stack, changeSetName)
      _ <- Try { System.out.println(describeResult) }
      _ <- prompt(config, "Do you want to proceed with applying this change set?"){
        executeChangeSet(config, stack, changeSetName).map { _ =>
          System.out.println(s"Initiated execution of change set: ${changeSetName}")
        }
      }
    } yield ()
  }

  def createChangeSet(config: Config, stack: Stack, changeSetName: String, changeSetType: String): Try[CreateChangeSetResult] = Try {
    val client = config.cloudFormationClient
    val request = new CreateChangeSetRequest()
    request.setStackName(stack.name)
    request.setParameters(config.parameters.asJava)
    request.setTags(config.tags.asJava)
    request.setTemplateBody(new Writer().write(stack)) // TODO: support upload to s3
    request.setChangeSetName(changeSetName)
    request.setChangeSetType(changeSetType)
    client.createChangeSet(request)
  }

  def describeChangeSet(config: Config, stack: Stack, changeSetName: String): Try[DescribeChangeSetResult] = Try {
    val client = config.cloudFormationClient
    val request = new DescribeChangeSetRequest()
    request.setStackName(stack.name)
    request.setChangeSetName(changeSetName)
    client.describeChangeSet(request)
  }

  def executeChangeSet(config: Config, stack: Stack, changeSetName: String): Try[ExecuteChangeSetResult] = Try {
    val client = config.cloudFormationClient
    val request = new ExecuteChangeSetRequest()
    request.setStackName(stack.name)
    request.setChangeSetName(changeSetName)
    client.executeChangeSet(request)
  }

  def waitForChangeSet(config: Config, stack: Stack, changeSetName: String): Try[DescribeChangeSetResult] = {
    System.out.print("Waiting for the change set to be available")
    def loop(): Try[DescribeChangeSetResult] = {
      describeChangeSet(config, stack, changeSetName).flatMap { result =>
        if (result.getStatus == "CREATE_PENDING" || result.getStatus == "CREATE_IN_PROGRESS") {
          Thread.sleep(1000L)
          System.out.print(".")
          loop()
        } else {
          System.out.println()
          Success(result)
        }
      }
    }
    loop()
  }
}
