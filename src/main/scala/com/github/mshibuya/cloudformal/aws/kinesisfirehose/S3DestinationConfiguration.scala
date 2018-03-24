package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
 */

case class S3DestinationConfiguration(
    bucketARN: NonEmptyProperty[String],
    bufferingHints: NonEmptyProperty[BufferingHints],
    cloudWatchLoggingOptions: Property[CloudWatchLoggingOptions] = Empty,
    compressionFormat: NonEmptyProperty[String],
    encryptionConfiguration: Property[EncryptionConfiguration] = Empty,
    prefix: Property[String] = Empty,
    roleARN: NonEmptyProperty[String]) extends Expression[S3DestinationConfiguration] {
  def render: Formattable = Value(
    "BucketARN" -> bucketARN,
    "BufferingHints" -> bufferingHints,
    "CloudWatchLoggingOptions" -> cloudWatchLoggingOptions,
    "CompressionFormat" -> compressionFormat,
    "EncryptionConfiguration" -> encryptionConfiguration,
    "Prefix" -> prefix,
    "RoleARN" -> roleARN
  )
}
