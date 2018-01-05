package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html
 */

case class XssMatchTuple(
    textTransformation: String,
    fieldToMatch: FieldToMatch) extends Renderable {
  def render: Formattable = Formattable.opt(
    "TextTransformation" -> Some(Formattable(textTransformation)),
    "FieldToMatch" -> Some(Formattable(fieldToMatch))
  )
}
