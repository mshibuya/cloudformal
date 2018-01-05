package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html
 */

case class KinesisFirehoseInput(
    resourceARN: String,
    roleARN: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ResourceARN" -> Some(Formattable(resourceARN)),
    "RoleARN" -> Some(Formattable(roleARN))
  )
}
