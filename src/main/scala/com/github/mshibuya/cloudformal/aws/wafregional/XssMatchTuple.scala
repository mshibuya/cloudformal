package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html
 */

case class XssMatchTuple(
    textTransformation: NonEmptyProperty[String],
    fieldToMatch: NonEmptyProperty[FieldToMatch]) extends Expression[XssMatchTuple] {
  def render: Formattable = Value(
    "TextTransformation" -> textTransformation,
    "FieldToMatch" -> fieldToMatch
  )
}
