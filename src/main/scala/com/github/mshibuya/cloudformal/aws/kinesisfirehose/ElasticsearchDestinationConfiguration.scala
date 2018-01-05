package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html
 */

case class ElasticsearchDestinationConfiguration(
    bufferingHints: ElasticsearchBufferingHints,
    cloudWatchLoggingOptions: Option[CloudWatchLoggingOptions] = None,
    domainARN: String,
    indexName: String,
    indexRotationPeriod: String,
    processingConfiguration: Option[ProcessingConfiguration] = None,
    retryOptions: ElasticsearchRetryOptions,
    roleARN: String,
    s3BackupMode: String,
    s3Configuration: S3DestinationConfiguration,
    typeName: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "BufferingHints" -> Some(Formattable(bufferingHints)),
    "CloudWatchLoggingOptions" -> cloudWatchLoggingOptions.map(Formattable(_)),
    "DomainARN" -> Some(Formattable(domainARN)),
    "IndexName" -> Some(Formattable(indexName)),
    "IndexRotationPeriod" -> Some(Formattable(indexRotationPeriod)),
    "ProcessingConfiguration" -> processingConfiguration.map(Formattable(_)),
    "RetryOptions" -> Some(Formattable(retryOptions)),
    "RoleARN" -> Some(Formattable(roleARN)),
    "S3BackupMode" -> Some(Formattable(s3BackupMode)),
    "S3Configuration" -> Some(Formattable(s3Configuration)),
    "TypeName" -> Some(Formattable(typeName))
  )
}
