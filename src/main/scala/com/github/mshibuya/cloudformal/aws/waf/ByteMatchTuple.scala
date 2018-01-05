package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html
 */

case class ByteMatchTuple(
    fieldToMatch: FieldToMatch,
    positionalConstraint: String,
    targetString: Option[String] = None,
    targetStringBase64: Option[String] = None,
    textTransformation: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "FieldToMatch" -> Some(Formattable(fieldToMatch)),
    "PositionalConstraint" -> Some(Formattable(positionalConstraint)),
    "TargetString" -> targetString.map(Formattable(_)),
    "TargetStringBase64" -> targetStringBase64.map(Formattable(_)),
    "TextTransformation" -> Some(Formattable(textTransformation))
  )
}
