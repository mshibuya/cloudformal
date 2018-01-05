package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html
 */

case class Action(
    targetGroupArn: String,
    `type`: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "TargetGroupArn" -> Some(Formattable(targetGroupArn)),
    "Type" -> Some(Formattable(`type`))
  )
}
