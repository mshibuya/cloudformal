package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html
 */

case class ByteMatchTuple(
    targetString: Property[String] = Empty,
    targetStringBase64: Property[String] = Empty,
    positionalConstraint: NonEmptyProperty[String],
    textTransformation: NonEmptyProperty[String],
    fieldToMatch: NonEmptyProperty[FieldToMatch]) extends Expression[ByteMatchTuple] {
  def render: Formattable = Value(
    "TargetString" -> targetString,
    "TargetStringBase64" -> targetStringBase64,
    "PositionalConstraint" -> positionalConstraint,
    "TextTransformation" -> textTransformation,
    "FieldToMatch" -> fieldToMatch
  )
}
