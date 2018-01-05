package com.github.mshibuya.cloudformal.aws.ssm

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html
 */

trait MaintenanceWindowTask extends Resource {
  val resourceTypeName = "AWS::SSM::MaintenanceWindowTask"

  def maxErrors: String
  def description: Option[String] = None
  def serviceRoleArn: String
  def priority: Int
  def maxConcurrency: String
  def targets: Seq[Target]
  def name: Option[String] = None
  def taskArn: String
  def taskInvocationParameters: Option[TaskInvocationParameters] = None
  def windowId: Option[String] = None
  def taskParameters: Option[Json] = None
  def taskType: String
  def loggingInfo: Option[LoggingInfo] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "MaxErrors" -> Some(Formattable(maxErrors)),
    "Description" -> description.map(Formattable(_)),
    "ServiceRoleArn" -> Some(Formattable(serviceRoleArn)),
    "Priority" -> Some(Formattable(priority)),
    "MaxConcurrency" -> Some(Formattable(maxConcurrency)),
    "Targets" -> Some(Formattable(targets)),
    "Name" -> name.map(Formattable(_)),
    "TaskArn" -> Some(Formattable(taskArn)),
    "TaskInvocationParameters" -> taskInvocationParameters.map(Formattable(_)),
    "WindowId" -> windowId.map(Formattable(_)),
    "TaskParameters" -> taskParameters.map(Formattable(_)),
    "TaskType" -> Some(Formattable(taskType)),
    "LoggingInfo" -> loggingInfo.map(Formattable(_))
  )
}
