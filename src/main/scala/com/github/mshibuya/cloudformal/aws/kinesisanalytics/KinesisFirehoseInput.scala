package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html
 */

case class KinesisFirehoseInput(
    resourceARN: NonEmptyProperty[String],
    roleARN: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ResourceARN" -> resourceARN,
    "RoleARN" -> roleARN
  )
}
