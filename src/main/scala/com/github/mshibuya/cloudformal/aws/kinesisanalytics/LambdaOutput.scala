package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html
 */

case class LambdaOutput(
    resourceARN: NonEmptyProperty[String],
    roleARN: NonEmptyProperty[String]) extends Expression[LambdaOutput] {
  def render: Formattable = Value(
    "ResourceARN" -> resourceARN,
    "RoleARN" -> roleARN
  )
}
