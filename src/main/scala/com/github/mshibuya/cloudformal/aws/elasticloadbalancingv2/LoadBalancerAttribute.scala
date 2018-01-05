package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattributes.html
 */

case class LoadBalancerAttribute(
    key: Option[String] = None,
    value: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Key" -> key.map(Formattable(_)),
    "Value" -> value.map(Formattable(_))
  )
}
