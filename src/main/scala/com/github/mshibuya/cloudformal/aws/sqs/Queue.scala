package com.github.mshibuya.cloudformal.aws.sqs

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html
 */

trait Queue extends Resource {
  val resourceTypeName = "AWS::SQS::Queue"

  def contentBasedDeduplication: Option[Boolean] = None
  def delaySeconds: Option[Int] = None
  def fifoQueue: Option[Boolean] = None
  def kmsDataKeyReusePeriodSeconds: Option[Int] = None
  def kmsMasterKeyId: Option[String] = None
  def maximumMessageSize: Option[Int] = None
  def messageRetentionPeriod: Option[Int] = None
  def queueName: Option[String] = None
  def receiveMessageWaitTimeSeconds: Option[Int] = None
  def redrivePolicy: Option[Json] = None
  def visibilityTimeout: Option[Int] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ContentBasedDeduplication" -> contentBasedDeduplication.map(Formattable(_)),
    "DelaySeconds" -> delaySeconds.map(Formattable(_)),
    "FifoQueue" -> fifoQueue.map(Formattable(_)),
    "KmsDataKeyReusePeriodSeconds" -> kmsDataKeyReusePeriodSeconds.map(Formattable(_)),
    "KmsMasterKeyId" -> kmsMasterKeyId.map(Formattable(_)),
    "MaximumMessageSize" -> maximumMessageSize.map(Formattable(_)),
    "MessageRetentionPeriod" -> messageRetentionPeriod.map(Formattable(_)),
    "QueueName" -> queueName.map(Formattable(_)),
    "ReceiveMessageWaitTimeSeconds" -> receiveMessageWaitTimeSeconds.map(Formattable(_)),
    "RedrivePolicy" -> redrivePolicy.map(Formattable(_)),
    "VisibilityTimeout" -> visibilityTimeout.map(Formattable(_))
  )
}
