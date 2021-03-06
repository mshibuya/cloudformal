package com.github.mshibuya.cloudformal.aws.sqs

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html
 */

trait QueuePolicy extends Resource[QueuePolicy] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SQS::QueuePolicy"

  def policyDocument: NonEmptyProperty[Json]
  def queues: NonEmptyProperty[Seq[String]]

  def render(): MapValue[_] = Value(
    "PolicyDocument" -> policyDocument,
    "Queues" -> queues
  )
}
