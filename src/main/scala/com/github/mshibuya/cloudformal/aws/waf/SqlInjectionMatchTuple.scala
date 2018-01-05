package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html
 */

case class SqlInjectionMatchTuple(
    fieldToMatch: FieldToMatch,
    textTransformation: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "FieldToMatch" -> Some(Formattable(fieldToMatch)),
    "TextTransformation" -> Some(Formattable(textTransformation))
  )
}
