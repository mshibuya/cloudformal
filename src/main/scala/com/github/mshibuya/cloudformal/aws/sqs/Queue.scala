package com.github.mshibuya.cloudformal.aws.sqs

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html
 */

trait Queue extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SQS::Queue"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  def queueNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "QueueName")

  def contentBasedDeduplication: Property[Boolean] = Empty
  def delaySeconds: Property[Int] = Empty
  def fifoQueue: Property[Boolean] = Empty
  def kmsDataKeyReusePeriodSeconds: Property[Int] = Empty
  def kmsMasterKeyId: Property[String] = Empty
  def maximumMessageSize: Property[Int] = Empty
  def messageRetentionPeriod: Property[Int] = Empty
  def queueName: Property[String] = Empty
  def receiveMessageWaitTimeSeconds: Property[Int] = Empty
  def redrivePolicy: Property[Json] = Empty
  def visibilityTimeout: Property[Int] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ContentBasedDeduplication" -> contentBasedDeduplication,
    "DelaySeconds" -> delaySeconds,
    "FifoQueue" -> fifoQueue,
    "KmsDataKeyReusePeriodSeconds" -> kmsDataKeyReusePeriodSeconds,
    "KmsMasterKeyId" -> kmsMasterKeyId,
    "MaximumMessageSize" -> maximumMessageSize,
    "MessageRetentionPeriod" -> messageRetentionPeriod,
    "QueueName" -> queueName,
    "ReceiveMessageWaitTimeSeconds" -> receiveMessageWaitTimeSeconds,
    "RedrivePolicy" -> redrivePolicy,
    "VisibilityTimeout" -> visibilityTimeout
  )
}
