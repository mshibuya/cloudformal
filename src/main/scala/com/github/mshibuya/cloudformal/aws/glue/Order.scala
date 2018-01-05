package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html
 */

case class Order(
    column: String,
    sortOrder: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Column" -> Some(Formattable(column)),
    "SortOrder" -> Some(Formattable(sortOrder))
  )
}
