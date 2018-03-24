package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicates.html
 */

case class Predicate(
    dataId: NonEmptyProperty[String],
    negated: NonEmptyProperty[Boolean],
    `type`: NonEmptyProperty[String]) extends Expression[Predicate] {
  def render: Formattable = Value(
    "DataId" -> dataId,
    "Negated" -> negated,
    "Type" -> `type`
  )
}
