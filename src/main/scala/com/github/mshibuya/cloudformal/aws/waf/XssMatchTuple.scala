package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-xssmatchset-xssmatchtuple.html
 */

case class XssMatchTuple(
    fieldToMatch: NonEmptyProperty[FieldToMatch],
    textTransformation: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "FieldToMatch" -> fieldToMatch,
    "TextTransformation" -> textTransformation
  )
}
