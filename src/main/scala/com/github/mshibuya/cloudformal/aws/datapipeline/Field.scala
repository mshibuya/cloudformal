package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html
 */

case class Field(
    key: NonEmptyProperty[String],
    refValue: Property[String] = Empty,
    stringValue: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Key" -> key,
    "RefValue" -> refValue,
    "StringValue" -> stringValue
  )
}
