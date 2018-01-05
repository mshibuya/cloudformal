package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html
 */

case class ParameterAttribute(
    key: String,
    stringValue: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Key" -> Some(Formattable(key)),
    "StringValue" -> Some(Formattable(stringValue))
  )
}
