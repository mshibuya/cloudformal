package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html
 */

trait ListenerRule extends Resource {
  val resourceTypeName = "AWS::ElasticLoadBalancingV2::ListenerRule"

  def actions: Seq[Action]
  def conditions: Seq[RuleCondition]
  def listenerArn: String
  def priority: Int

  def resourceProperties: FormattableMap = Formattable.opt(
    "Actions" -> Some(Formattable(actions)),
    "Conditions" -> Some(Formattable(conditions)),
    "ListenerArn" -> Some(Formattable(listenerArn)),
    "Priority" -> Some(Formattable(priority))
  )
}
