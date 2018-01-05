package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html
 */

case class Field(
    key: String,
    refValue: Option[String] = None,
    stringValue: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Key" -> Some(Formattable(key)),
    "RefValue" -> refValue.map(Formattable(_)),
    "StringValue" -> stringValue.map(Formattable(_))
  )
}
