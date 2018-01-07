package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html
 */

case class SqlInjectionMatchTuple(
    fieldToMatch: NonEmptyProperty[FieldToMatch],
    textTransformation: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "FieldToMatch" -> fieldToMatch,
    "TextTransformation" -> textTransformation
  )
}
