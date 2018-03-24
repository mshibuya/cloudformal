package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html
 */

case class TargetGroupAttribute(
    key: Property[String] = Empty,
    value: Property[String] = Empty) extends Expression[TargetGroupAttribute] {
  def render: Formattable = Value(
    "Key" -> key,
    "Value" -> value
  )
}
