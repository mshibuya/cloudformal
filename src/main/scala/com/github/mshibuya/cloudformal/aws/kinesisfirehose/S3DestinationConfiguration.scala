package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
 */

case class S3DestinationConfiguration(
    bucketARN: String,
    bufferingHints: BufferingHints,
    cloudWatchLoggingOptions: Option[CloudWatchLoggingOptions] = None,
    compressionFormat: String,
    encryptionConfiguration: Option[EncryptionConfiguration] = None,
    prefix: Option[String] = None,
    roleARN: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "BucketARN" -> Some(Formattable(bucketARN)),
    "BufferingHints" -> Some(Formattable(bufferingHints)),
    "CloudWatchLoggingOptions" -> cloudWatchLoggingOptions.map(Formattable(_)),
    "CompressionFormat" -> Some(Formattable(compressionFormat)),
    "EncryptionConfiguration" -> encryptionConfiguration.map(Formattable(_)),
    "Prefix" -> prefix.map(Formattable(_)),
    "RoleARN" -> Some(Formattable(roleARN))
  )
}
