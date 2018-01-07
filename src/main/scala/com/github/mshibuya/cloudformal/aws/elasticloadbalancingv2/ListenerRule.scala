package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html
 */

trait ListenerRule extends Resource {
  val resourceTypeName = "AWS::ElasticLoadBalancingV2::ListenerRule"

  def actions: NonEmptyProperty[Seq[Action]]
  def conditions: NonEmptyProperty[Seq[RuleCondition]]
  def listenerArn: NonEmptyProperty[String]
  def priority: NonEmptyProperty[Int]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Actions" -> actions,
    "Conditions" -> conditions,
    "ListenerArn" -> listenerArn,
    "Priority" -> priority
  )
}
