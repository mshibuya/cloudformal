package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html
 */

case class Action(
    targetGroupArn: NonEmptyProperty[String],
    `type`: NonEmptyProperty[String]) extends Expression[Action] {
  def render: Formattable = Value(
    "TargetGroupArn" -> targetGroupArn,
    "Type" -> `type`
  )
}
