package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html
 */

case class HealthCheck(
    healthyThreshold: String,
    interval: String,
    target: String,
    timeout: String,
    unhealthyThreshold: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "HealthyThreshold" -> Some(Formattable(healthyThreshold)),
    "Interval" -> Some(Formattable(interval)),
    "Target" -> Some(Formattable(target)),
    "Timeout" -> Some(Formattable(timeout)),
    "UnhealthyThreshold" -> Some(Formattable(unhealthyThreshold))
  )
}
