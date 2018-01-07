package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html
 */

case class SizeConstraint(
    comparisonOperator: NonEmptyProperty[String],
    fieldToMatch: NonEmptyProperty[FieldToMatch],
    size: NonEmptyProperty[Int],
    textTransformation: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ComparisonOperator" -> comparisonOperator,
    "FieldToMatch" -> fieldToMatch,
    "Size" -> size,
    "TextTransformation" -> textTransformation
  )
}
