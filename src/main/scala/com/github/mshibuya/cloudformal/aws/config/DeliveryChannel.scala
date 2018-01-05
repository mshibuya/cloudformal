package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html
 */

trait DeliveryChannel extends Resource {
  val resourceTypeName = "AWS::Config::DeliveryChannel"

  def configSnapshotDeliveryProperties: Option[ConfigSnapshotDeliveryProperties] = None
  def name: Option[String] = None
  def s3BucketName: String
  def s3KeyPrefix: Option[String] = None
  def snsTopicARN: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ConfigSnapshotDeliveryProperties" -> configSnapshotDeliveryProperties.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "S3BucketName" -> Some(Formattable(s3BucketName)),
    "S3KeyPrefix" -> s3KeyPrefix.map(Formattable(_)),
    "SnsTopicARN" -> snsTopicARN.map(Formattable(_))
  )
}
