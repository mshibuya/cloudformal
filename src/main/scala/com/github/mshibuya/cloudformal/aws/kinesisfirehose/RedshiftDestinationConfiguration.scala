package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html
 */

case class RedshiftDestinationConfiguration(
    cloudWatchLoggingOptions: Option[CloudWatchLoggingOptions] = None,
    clusterJDBCURL: String,
    copyCommand: CopyCommand,
    password: String,
    processingConfiguration: Option[ProcessingConfiguration] = None,
    roleARN: String,
    s3Configuration: S3DestinationConfiguration,
    username: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CloudWatchLoggingOptions" -> cloudWatchLoggingOptions.map(Formattable(_)),
    "ClusterJDBCURL" -> Some(Formattable(clusterJDBCURL)),
    "CopyCommand" -> Some(Formattable(copyCommand)),
    "Password" -> Some(Formattable(password)),
    "ProcessingConfiguration" -> processingConfiguration.map(Formattable(_)),
    "RoleARN" -> Some(Formattable(roleARN)),
    "S3Configuration" -> Some(Formattable(s3Configuration)),
    "Username" -> Some(Formattable(username))
  )
}
