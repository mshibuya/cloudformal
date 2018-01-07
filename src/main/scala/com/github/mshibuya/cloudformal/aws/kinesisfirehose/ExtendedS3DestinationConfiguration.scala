package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html
 */

case class ExtendedS3DestinationConfiguration(
    bucketARN: NonEmptyProperty[String],
    bufferingHints: NonEmptyProperty[BufferingHints],
    cloudWatchLoggingOptions: Property[CloudWatchLoggingOptions] = Empty,
    compressionFormat: NonEmptyProperty[String],
    encryptionConfiguration: Property[EncryptionConfiguration] = Empty,
    prefix: NonEmptyProperty[String],
    processingConfiguration: Property[ProcessingConfiguration] = Empty,
    roleARN: NonEmptyProperty[String],
    s3BackupConfiguration: Property[S3DestinationConfiguration] = Empty,
    s3BackupMode: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "BucketARN" -> bucketARN,
    "BufferingHints" -> bufferingHints,
    "CloudWatchLoggingOptions" -> cloudWatchLoggingOptions,
    "CompressionFormat" -> compressionFormat,
    "EncryptionConfiguration" -> encryptionConfiguration,
    "Prefix" -> prefix,
    "ProcessingConfiguration" -> processingConfiguration,
    "RoleARN" -> roleARN,
    "S3BackupConfiguration" -> s3BackupConfiguration,
    "S3BackupMode" -> s3BackupMode
  )
}
