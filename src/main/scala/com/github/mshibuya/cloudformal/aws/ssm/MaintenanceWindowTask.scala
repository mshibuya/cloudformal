package com.github.mshibuya.cloudformal.aws.ssm

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html
 */

trait MaintenanceWindowTask extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SSM::MaintenanceWindowTask"

  def maxErrors: NonEmptyProperty[String]
  def description: Property[String] = Empty
  def serviceRoleArn: NonEmptyProperty[String]
  def priority: NonEmptyProperty[Int]
  def maxConcurrency: NonEmptyProperty[String]
  def targets: NonEmptyProperty[Seq[Target]]
  def name: Property[String] = Empty
  def taskArn: NonEmptyProperty[String]
  def taskInvocationParameters: Property[TaskInvocationParameters] = Empty
  def windowId: Property[String] = Empty
  def taskParameters: Property[Json] = Empty
  def taskType: NonEmptyProperty[String]
  def loggingInfo: Property[LoggingInfo] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "MaxErrors" -> maxErrors,
    "Description" -> description,
    "ServiceRoleArn" -> serviceRoleArn,
    "Priority" -> priority,
    "MaxConcurrency" -> maxConcurrency,
    "Targets" -> targets,
    "Name" -> name,
    "TaskArn" -> taskArn,
    "TaskInvocationParameters" -> taskInvocationParameters,
    "WindowId" -> windowId,
    "TaskParameters" -> taskParameters,
    "TaskType" -> taskType,
    "LoggingInfo" -> loggingInfo
  )
}
