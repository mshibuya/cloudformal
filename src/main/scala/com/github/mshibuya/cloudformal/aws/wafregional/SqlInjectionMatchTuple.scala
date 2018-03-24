package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuple.html
 */

case class SqlInjectionMatchTuple(
    textTransformation: NonEmptyProperty[String],
    fieldToMatch: NonEmptyProperty[FieldToMatch]) extends Expression[SqlInjectionMatchTuple] {
  def render: Formattable = Value(
    "TextTransformation" -> textTransformation,
    "FieldToMatch" -> fieldToMatch
  )
}
