package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html
 */

trait DeliveryStream extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::KinesisFirehose::DeliveryStream"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def deliveryStreamName: Property[String] = Empty
  def deliveryStreamType: Property[String] = Empty
  def elasticsearchDestinationConfiguration: Property[ElasticsearchDestinationConfiguration] = Empty
  def extendedS3DestinationConfiguration: Property[ExtendedS3DestinationConfiguration] = Empty
  def kinesisStreamSourceConfiguration: Property[KinesisStreamSourceConfiguration] = Empty
  def redshiftDestinationConfiguration: Property[RedshiftDestinationConfiguration] = Empty
  def s3DestinationConfiguration: Property[S3DestinationConfiguration] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DeliveryStreamName" -> deliveryStreamName,
    "DeliveryStreamType" -> deliveryStreamType,
    "ElasticsearchDestinationConfiguration" -> elasticsearchDestinationConfiguration,
    "ExtendedS3DestinationConfiguration" -> extendedS3DestinationConfiguration,
    "KinesisStreamSourceConfiguration" -> kinesisStreamSourceConfiguration,
    "RedshiftDestinationConfiguration" -> redshiftDestinationConfiguration,
    "S3DestinationConfiguration" -> s3DestinationConfiguration
  )
}
