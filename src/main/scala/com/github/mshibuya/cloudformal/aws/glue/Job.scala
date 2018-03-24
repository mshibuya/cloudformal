package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html
 */

trait Job extends Resource[Job] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Glue::Job"

  def role: NonEmptyProperty[String]
  def defaultArguments: Property[Json] = Empty
  def connections: Property[ConnectionsList] = Empty
  def maxRetries: Property[Double] = Empty
  def description: Property[String] = Empty
  def logUri: Property[String] = Empty
  def command: NonEmptyProperty[JobCommand]
  def allocatedCapacity: Property[Double] = Empty
  def executionProperty: Property[ExecutionProperty] = Empty
  def name: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "Role" -> role,
    "DefaultArguments" -> defaultArguments,
    "Connections" -> connections,
    "MaxRetries" -> maxRetries,
    "Description" -> description,
    "LogUri" -> logUri,
    "Command" -> command,
    "AllocatedCapacity" -> allocatedCapacity,
    "ExecutionProperty" -> executionProperty,
    "Name" -> name
  )
}
