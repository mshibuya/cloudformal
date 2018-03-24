package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html
 */

case class ParameterValue(
    id: NonEmptyProperty[String],
    stringValue: NonEmptyProperty[String]) extends Expression[ParameterValue] {
  def render: Formattable = Value(
    "Id" -> id,
    "StringValue" -> stringValue
  )
}
