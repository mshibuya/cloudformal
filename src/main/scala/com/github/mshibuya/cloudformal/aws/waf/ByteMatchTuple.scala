package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html
 */

case class ByteMatchTuple(
    fieldToMatch: NonEmptyProperty[FieldToMatch],
    positionalConstraint: NonEmptyProperty[String],
    targetString: Property[String] = Empty,
    targetStringBase64: Property[String] = Empty,
    textTransformation: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "FieldToMatch" -> fieldToMatch,
    "PositionalConstraint" -> positionalConstraint,
    "TargetString" -> targetString,
    "TargetStringBase64" -> targetStringBase64,
    "TextTransformation" -> textTransformation
  )
}
