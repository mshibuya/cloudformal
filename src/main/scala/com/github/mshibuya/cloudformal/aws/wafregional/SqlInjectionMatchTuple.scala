package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuple.html
 */

case class SqlInjectionMatchTuple(
    textTransformation: String,
    fieldToMatch: FieldToMatch) extends Renderable {
  def render: Formattable = Formattable.opt(
    "TextTransformation" -> Some(Formattable(textTransformation)),
    "FieldToMatch" -> Some(Formattable(fieldToMatch))
  )
}
