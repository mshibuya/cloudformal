package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html
 */

case class PipelineObject(
    fields: NonEmptyProperty[Seq[Field]],
    id: NonEmptyProperty[String],
    name: NonEmptyProperty[String]) extends Expression[PipelineObject] {
  def render: Formattable = Value(
    "Fields" -> fields,
    "Id" -> id,
    "Name" -> name
  )
}
