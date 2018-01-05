package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html
 */

case class PipelineObject(
    fields: Seq[Field],
    id: String,
    name: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Fields" -> Some(Formattable(fields)),
    "Id" -> Some(Formattable(id)),
    "Name" -> Some(Formattable(name))
  )
}
