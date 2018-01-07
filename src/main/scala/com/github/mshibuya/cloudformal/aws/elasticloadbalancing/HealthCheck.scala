package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html
 */

case class HealthCheck(
    healthyThreshold: NonEmptyProperty[String],
    interval: NonEmptyProperty[String],
    target: NonEmptyProperty[String],
    timeout: NonEmptyProperty[String],
    unhealthyThreshold: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "HealthyThreshold" -> healthyThreshold,
    "Interval" -> interval,
    "Target" -> target,
    "Timeout" -> timeout,
    "UnhealthyThreshold" -> unhealthyThreshold
  )
}
