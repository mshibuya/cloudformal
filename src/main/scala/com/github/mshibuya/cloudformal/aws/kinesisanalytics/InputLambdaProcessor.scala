package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html
 */

case class InputLambdaProcessor(
    resourceARN: NonEmptyProperty[String],
    roleARN: NonEmptyProperty[String]) extends Expression[InputLambdaProcessor] {
  def render: Formattable = Value(
    "ResourceARN" -> resourceARN,
    "RoleARN" -> roleARN
  )
}
