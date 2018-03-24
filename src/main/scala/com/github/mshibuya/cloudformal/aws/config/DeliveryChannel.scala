package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html
 */

trait DeliveryChannel extends Resource[DeliveryChannel] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Config::DeliveryChannel"

  def configSnapshotDeliveryProperties: Property[ConfigSnapshotDeliveryProperties] = Empty
  def name: Property[String] = Empty
  def s3BucketName: NonEmptyProperty[String]
  def s3KeyPrefix: Property[String] = Empty
  def snsTopicARN: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "ConfigSnapshotDeliveryProperties" -> configSnapshotDeliveryProperties,
    "Name" -> name,
    "S3BucketName" -> s3BucketName,
    "S3KeyPrefix" -> s3KeyPrefix,
    "SnsTopicARN" -> snsTopicARN
  )
}
