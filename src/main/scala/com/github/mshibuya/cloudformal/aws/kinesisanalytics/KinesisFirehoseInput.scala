package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html
 */

case class KinesisFirehoseInput(
    resourceARN: NonEmptyProperty[String],
    roleARN: NonEmptyProperty[String]) extends Expression[KinesisFirehoseInput] {
  def render: Formattable = Value(
    "ResourceARN" -> resourceARN,
    "RoleARN" -> roleARN
  )
}
