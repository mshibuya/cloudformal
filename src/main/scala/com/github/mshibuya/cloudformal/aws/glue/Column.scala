package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html
 */

case class Column(
    comment: Option[String] = None,
    `type`: Option[String] = None,
    name: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Comment" -> comment.map(Formattable(_)),
    "Type" -> `type`.map(Formattable(_)),
    "Name" -> Some(Formattable(name))
  )
}
