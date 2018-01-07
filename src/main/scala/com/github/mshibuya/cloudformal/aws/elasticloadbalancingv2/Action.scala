package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html
 */

case class Action(
    targetGroupArn: NonEmptyProperty[String],
    `type`: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "TargetGroupArn" -> targetGroupArn,
    "Type" -> `type`
  )
}
