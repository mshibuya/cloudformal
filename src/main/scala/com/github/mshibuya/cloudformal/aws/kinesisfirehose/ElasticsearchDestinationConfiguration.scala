package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html
 */

case class ElasticsearchDestinationConfiguration(
    bufferingHints: NonEmptyProperty[ElasticsearchBufferingHints],
    cloudWatchLoggingOptions: Property[CloudWatchLoggingOptions] = Empty,
    domainARN: NonEmptyProperty[String],
    indexName: NonEmptyProperty[String],
    indexRotationPeriod: NonEmptyProperty[String],
    processingConfiguration: Property[ProcessingConfiguration] = Empty,
    retryOptions: NonEmptyProperty[ElasticsearchRetryOptions],
    roleARN: NonEmptyProperty[String],
    s3BackupMode: NonEmptyProperty[String],
    s3Configuration: NonEmptyProperty[S3DestinationConfiguration],
    typeName: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "BufferingHints" -> bufferingHints,
    "CloudWatchLoggingOptions" -> cloudWatchLoggingOptions,
    "DomainARN" -> domainARN,
    "IndexName" -> indexName,
    "IndexRotationPeriod" -> indexRotationPeriod,
    "ProcessingConfiguration" -> processingConfiguration,
    "RetryOptions" -> retryOptions,
    "RoleARN" -> roleARN,
    "S3BackupMode" -> s3BackupMode,
    "S3Configuration" -> s3Configuration,
    "TypeName" -> typeName
  )
}
