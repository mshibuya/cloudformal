package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html
 */

case class KinesisStreamsOutput(
    resourceARN: NonEmptyProperty[String],
    roleARN: NonEmptyProperty[String]) extends Expression[KinesisStreamsOutput] {
  def render: Formattable = Value(
    "ResourceARN" -> resourceARN,
    "RoleARN" -> roleARN
  )
}
