package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html
 */

case class SizeConstraint(
    comparisonOperator: String,
    size: Int,
    textTransformation: String,
    fieldToMatch: FieldToMatch) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ComparisonOperator" -> Some(Formattable(comparisonOperator)),
    "Size" -> Some(Formattable(size)),
    "TextTransformation" -> Some(Formattable(textTransformation)),
    "FieldToMatch" -> Some(Formattable(fieldToMatch))
  )
}
