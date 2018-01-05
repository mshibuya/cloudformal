package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html
 */

case class KinesisStreamSourceConfiguration(
    kinesisStreamARN: String,
    roleARN: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "KinesisStreamARN" -> Some(Formattable(kinesisStreamARN)),
    "RoleARN" -> Some(Formattable(roleARN))
  )
}
