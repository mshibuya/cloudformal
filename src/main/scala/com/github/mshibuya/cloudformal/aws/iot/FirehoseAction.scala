package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html
 */

case class FirehoseAction(
    deliveryStreamName: String,
    roleArn: String,
    separator: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DeliveryStreamName" -> Some(Formattable(deliveryStreamName)),
    "RoleArn" -> Some(Formattable(roleArn)),
    "Separator" -> separator.map(Formattable(_))
  )
}
