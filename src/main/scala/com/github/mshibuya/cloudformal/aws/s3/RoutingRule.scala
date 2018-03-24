package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html
 */

case class RoutingRule(
    redirectRule: NonEmptyProperty[RedirectRule],
    routingRuleCondition: Property[RoutingRuleCondition] = Empty) extends Expression[RoutingRule] {
  def render: Formattable = Value(
    "RedirectRule" -> redirectRule,
    "RoutingRuleCondition" -> routingRuleCondition
  )
}
