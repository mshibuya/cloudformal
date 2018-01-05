package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html
 */

case class ExtendedS3DestinationConfiguration(
    bucketARN: String,
    bufferingHints: BufferingHints,
    cloudWatchLoggingOptions: Option[CloudWatchLoggingOptions] = None,
    compressionFormat: String,
    encryptionConfiguration: Option[EncryptionConfiguration] = None,
    prefix: String,
    processingConfiguration: Option[ProcessingConfiguration] = None,
    roleARN: String,
    s3BackupConfiguration: Option[S3DestinationConfiguration] = None,
    s3BackupMode: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "BucketARN" -> Some(Formattable(bucketARN)),
    "BufferingHints" -> Some(Formattable(bufferingHints)),
    "CloudWatchLoggingOptions" -> cloudWatchLoggingOptions.map(Formattable(_)),
    "CompressionFormat" -> Some(Formattable(compressionFormat)),
    "EncryptionConfiguration" -> encryptionConfiguration.map(Formattable(_)),
    "Prefix" -> Some(Formattable(prefix)),
    "ProcessingConfiguration" -> processingConfiguration.map(Formattable(_)),
    "RoleARN" -> Some(Formattable(roleARN)),
    "S3BackupConfiguration" -> s3BackupConfiguration.map(Formattable(_)),
    "S3BackupMode" -> s3BackupMode.map(Formattable(_))
  )
}
