package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html
 */

case class FirehoseAction(
    deliveryStreamName: NonEmptyProperty[String],
    roleArn: NonEmptyProperty[String],
    separator: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DeliveryStreamName" -> deliveryStreamName,
    "RoleArn" -> roleArn,
    "Separator" -> separator
  )
}
