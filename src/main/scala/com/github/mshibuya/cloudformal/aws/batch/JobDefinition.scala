package com.github.mshibuya.cloudformal.aws.batch

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html
 */

trait JobDefinition extends Resource[JobDefinition] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Batch::JobDefinition"

  def `type`: NonEmptyProperty[String]
  def parameters: Property[Json] = Empty
  def containerProperties: NonEmptyProperty[ContainerProperties]
  def jobDefinitionName: Property[String] = Empty
  def retryStrategy: Property[RetryStrategy] = Empty

  def render(): MapValue[_] = Value(
    "Type" -> `type`,
    "Parameters" -> parameters,
    "ContainerProperties" -> containerProperties,
    "JobDefinitionName" -> jobDefinitionName,
    "RetryStrategy" -> retryStrategy
  )
}
