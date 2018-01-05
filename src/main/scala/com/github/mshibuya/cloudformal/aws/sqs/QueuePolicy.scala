package com.github.mshibuya.cloudformal.aws.sqs

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html
 */

trait QueuePolicy extends Resource {
  val resourceTypeName = "AWS::SQS::QueuePolicy"

  def policyDocument: Json
  def queues: Seq[String]

  def resourceProperties: FormattableMap = Formattable.opt(
    "PolicyDocument" -> Some(Formattable(policyDocument)),
    "Queues" -> Some(Formattable(queues))
  )
}
