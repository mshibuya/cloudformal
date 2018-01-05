package com.github.mshibuya.cloudformal.aws.batch

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html
 */

trait JobDefinition extends Resource {
  val resourceTypeName = "AWS::Batch::JobDefinition"

  def `type`: String
  def parameters: Option[Json] = None
  def containerProperties: ContainerProperties
  def jobDefinitionName: Option[String] = None
  def retryStrategy: Option[RetryStrategy] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Type" -> Some(Formattable(`type`)),
    "Parameters" -> parameters.map(Formattable(_)),
    "ContainerProperties" -> Some(Formattable(containerProperties)),
    "JobDefinitionName" -> jobDefinitionName.map(Formattable(_)),
    "RetryStrategy" -> retryStrategy.map(Formattable(_))
  )
}
