package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html
 */

case class RuleCondition(
    field: Property[String] = Empty,
    values: Property[Seq[String]] = Empty) extends Expression[RuleCondition] {
  def render: Formattable = Value(
    "Field" -> field,
    "Values" -> values
  )
}
