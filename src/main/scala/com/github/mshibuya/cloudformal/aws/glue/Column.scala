package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html
 */

case class Column(
    comment: Property[String] = Empty,
    `type`: Property[String] = Empty,
    name: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Comment" -> comment,
    "Type" -> `type`,
    "Name" -> name
  )
}
