package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html
 */

case class ByteMatchTuple(
    targetString: Option[String] = None,
    targetStringBase64: Option[String] = None,
    positionalConstraint: String,
    textTransformation: String,
    fieldToMatch: FieldToMatch) extends Renderable {
  def render: Formattable = Formattable.opt(
    "TargetString" -> targetString.map(Formattable(_)),
    "TargetStringBase64" -> targetStringBase64.map(Formattable(_)),
    "PositionalConstraint" -> Some(Formattable(positionalConstraint)),
    "TextTransformation" -> Some(Formattable(textTransformation)),
    "FieldToMatch" -> Some(Formattable(fieldToMatch))
  )
}
