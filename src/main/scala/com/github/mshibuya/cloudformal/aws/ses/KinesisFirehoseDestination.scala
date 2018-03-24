package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html
 */

case class KinesisFirehoseDestination(
    iamRoleARN: NonEmptyProperty[String],
    deliveryStreamARN: NonEmptyProperty[String]) extends Expression[KinesisFirehoseDestination] {
  def render: Formattable = Value(
    "IAMRoleARN" -> iamRoleARN,
    "DeliveryStreamARN" -> deliveryStreamARN
  )
}
