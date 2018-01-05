package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html
 */

case class TargetGroupAttribute(
    key: Option[String] = None,
    value: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Key" -> key.map(Formattable(_)),
    "Value" -> value.map(Formattable(_))
  )
}
