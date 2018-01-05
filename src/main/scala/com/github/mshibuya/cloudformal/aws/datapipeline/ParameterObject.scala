package com.github.mshibuya.cloudformal.aws.datapipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html
 */

case class ParameterObject(
    attributes: Seq[ParameterAttribute],
    id: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Attributes" -> Some(Formattable(attributes)),
    "Id" -> Some(Formattable(id))
  )
}
