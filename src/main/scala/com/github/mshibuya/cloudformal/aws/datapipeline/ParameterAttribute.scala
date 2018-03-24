package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html
 */

case class ParameterAttribute(
    key: NonEmptyProperty[String],
    stringValue: NonEmptyProperty[String]) extends Expression[ParameterAttribute] {
  def render: Formattable = Value(
    "Key" -> key,
    "StringValue" -> stringValue
  )
}
