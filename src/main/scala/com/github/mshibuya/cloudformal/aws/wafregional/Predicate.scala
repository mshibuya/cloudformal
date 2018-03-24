package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html
 */

case class Predicate(
    `type`: NonEmptyProperty[String],
    dataId: NonEmptyProperty[String],
    negated: NonEmptyProperty[Boolean]) extends Expression[Predicate] {
  def render: Formattable = Value(
    "Type" -> `type`,
    "DataId" -> dataId,
    "Negated" -> negated
  )
}
