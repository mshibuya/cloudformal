package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html
 */

case class RuleCondition(
    field: Option[String] = None,
    values: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Field" -> field.map(Formattable(_)),
    "Values" -> values.map(Formattable(_))
  )
}
