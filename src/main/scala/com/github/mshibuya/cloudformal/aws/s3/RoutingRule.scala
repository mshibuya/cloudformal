package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html
 */

case class RoutingRule(
    redirectRule: RedirectRule,
    routingRuleCondition: Option[RoutingRuleCondition] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "RedirectRule" -> Some(Formattable(redirectRule)),
    "RoutingRuleCondition" -> routingRuleCondition.map(Formattable(_))
  )
}
