package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html
 */

case class RedshiftDestinationConfiguration(
    cloudWatchLoggingOptions: Property[CloudWatchLoggingOptions] = Empty,
    clusterJDBCURL: NonEmptyProperty[String],
    copyCommand: NonEmptyProperty[CopyCommand],
    password: NonEmptyProperty[String],
    processingConfiguration: Property[ProcessingConfiguration] = Empty,
    roleARN: NonEmptyProperty[String],
    s3Configuration: NonEmptyProperty[S3DestinationConfiguration],
    username: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "CloudWatchLoggingOptions" -> cloudWatchLoggingOptions,
    "ClusterJDBCURL" -> clusterJDBCURL,
    "CopyCommand" -> copyCommand,
    "Password" -> password,
    "ProcessingConfiguration" -> processingConfiguration,
    "RoleARN" -> roleARN,
    "S3Configuration" -> s3Configuration,
    "Username" -> username
  )
}
