package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html
 */

case class KinesisStreamSourceConfiguration(
    kinesisStreamARN: NonEmptyProperty[String],
    roleARN: NonEmptyProperty[String]) extends Expression[KinesisStreamSourceConfiguration] {
  def render: Formattable = Value(
    "KinesisStreamARN" -> kinesisStreamARN,
    "RoleARN" -> roleARN
  )
}
