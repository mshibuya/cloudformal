package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html
 */

case class Column(
    comment: Property[String] = Empty,
    `type`: Property[String] = Empty,
    name: NonEmptyProperty[String]) extends Expression[Column] {
  def render: Formattable = Value(
    "Comment" -> comment,
    "Type" -> `type`,
    "Name" -> name
  )
}
