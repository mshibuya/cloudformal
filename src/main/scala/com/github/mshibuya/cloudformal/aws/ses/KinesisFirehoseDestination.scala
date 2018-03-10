package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html
 */

case class KinesisFirehoseDestination(
    iamRoleARN: NonEmptyProperty[String],
    deliveryStreamARN: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "IAMRoleARN" -> iamRoleARN,
    "DeliveryStreamARN" -> deliveryStreamARN
  )
}
