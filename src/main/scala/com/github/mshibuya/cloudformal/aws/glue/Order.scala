package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html
 */

case class Order(
    column: NonEmptyProperty[String],
    sortOrder: NonEmptyProperty[Int]) extends Expression[Order] {
  def render: Formattable = Value(
    "Column" -> column,
    "SortOrder" -> sortOrder
  )
}
