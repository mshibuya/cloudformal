package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html
 */

case class SizeConstraint(
    comparisonOperator: String,
    fieldToMatch: FieldToMatch,
    size: Int,
    textTransformation: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ComparisonOperator" -> Some(Formattable(comparisonOperator)),
    "FieldToMatch" -> Some(Formattable(fieldToMatch)),
    "Size" -> Some(Formattable(size)),
    "TextTransformation" -> Some(Formattable(textTransformation))
  )
}
