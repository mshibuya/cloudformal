package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html
 */

case class ParameterObject(
    attributes: NonEmptyProperty[Seq[ParameterAttribute]],
    id: NonEmptyProperty[String]) extends Expression[ParameterObject] {
  def render: Formattable = Value(
    "Attributes" -> attributes,
    "Id" -> id
  )
}
