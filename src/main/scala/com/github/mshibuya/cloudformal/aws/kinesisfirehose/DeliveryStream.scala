package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html
 */

trait DeliveryStream extends Resource {
  val resourceTypeName = "AWS::KinesisFirehose::DeliveryStream"

  def deliveryStreamName: Option[String] = None
  def deliveryStreamType: Option[String] = None
  def elasticsearchDestinationConfiguration: Option[ElasticsearchDestinationConfiguration] = None
  def extendedS3DestinationConfiguration: Option[ExtendedS3DestinationConfiguration] = None
  def kinesisStreamSourceConfiguration: Option[KinesisStreamSourceConfiguration] = None
  def redshiftDestinationConfiguration: Option[RedshiftDestinationConfiguration] = None
  def s3DestinationConfiguration: Option[S3DestinationConfiguration] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "DeliveryStreamName" -> deliveryStreamName.map(Formattable(_)),
    "DeliveryStreamType" -> deliveryStreamType.map(Formattable(_)),
    "ElasticsearchDestinationConfiguration" -> elasticsearchDestinationConfiguration.map(Formattable(_)),
    "ExtendedS3DestinationConfiguration" -> extendedS3DestinationConfiguration.map(Formattable(_)),
    "KinesisStreamSourceConfiguration" -> kinesisStreamSourceConfiguration.map(Formattable(_)),
    "RedshiftDestinationConfiguration" -> redshiftDestinationConfiguration.map(Formattable(_)),
    "S3DestinationConfiguration" -> s3DestinationConfiguration.map(Formattable(_))
  )
}
