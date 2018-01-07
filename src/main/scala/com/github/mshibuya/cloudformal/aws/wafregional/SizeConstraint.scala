package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html
 */

case class SizeConstraint(
    comparisonOperator: NonEmptyProperty[String],
    size: NonEmptyProperty[Int],
    textTransformation: NonEmptyProperty[String],
    fieldToMatch: NonEmptyProperty[FieldToMatch]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ComparisonOperator" -> comparisonOperator,
    "Size" -> size,
    "TextTransformation" -> textTransformation,
    "FieldToMatch" -> fieldToMatch
  )
}
