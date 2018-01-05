package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html
 */

trait Job extends Resource {
  val resourceTypeName = "AWS::Glue::Job"

  def role: String
  def defaultArguments: Option[Json] = None
  def connections: Option[ConnectionsList] = None
  def maxRetries: Option[Double] = None
  def description: Option[String] = None
  def logUri: Option[String] = None
  def command: JobCommand
  def allocatedCapacity: Option[Double] = None
  def executionProperty: Option[ExecutionProperty] = None
  def name: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Role" -> Some(Formattable(role)),
    "DefaultArguments" -> defaultArguments.map(Formattable(_)),
    "Connections" -> connections.map(Formattable(_)),
    "MaxRetries" -> maxRetries.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "LogUri" -> logUri.map(Formattable(_)),
    "Command" -> Some(Formattable(command)),
    "AllocatedCapacity" -> allocatedCapacity.map(Formattable(_)),
    "ExecutionProperty" -> executionProperty.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
