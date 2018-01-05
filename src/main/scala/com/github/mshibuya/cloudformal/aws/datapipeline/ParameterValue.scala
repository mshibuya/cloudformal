package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html
 */

case class ParameterValue(
    id: String,
    stringValue: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Id" -> Some(Formattable(id)),
    "StringValue" -> Some(Formattable(stringValue))
  )
}
