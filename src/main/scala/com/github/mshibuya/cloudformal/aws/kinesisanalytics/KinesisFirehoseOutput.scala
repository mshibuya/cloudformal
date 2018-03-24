package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html
 */

case class KinesisFirehoseOutput(
    resourceARN: NonEmptyProperty[String],
    roleARN: NonEmptyProperty[String]) extends Expression[KinesisFirehoseOutput] {
  def render: Formattable = Value(
    "ResourceARN" -> resourceARN,
    "RoleARN" -> roleARN
  )
}
