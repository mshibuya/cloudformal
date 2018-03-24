package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html
 */

trait ListenerRule extends Resource[ListenerRule] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ElasticLoadBalancingV2::ListenerRule"

  def actions: NonEmptyProperty[Seq[Action]]
  def conditions: NonEmptyProperty[Seq[RuleCondition]]
  def listenerArn: NonEmptyProperty[String]
  def priority: NonEmptyProperty[Int]

  def render(): MapValue[_] = Value(
    "Actions" -> actions,
    "Conditions" -> conditions,
    "ListenerArn" -> listenerArn,
    "Priority" -> priority
  )
}
