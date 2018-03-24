package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html
 */

case class ConnectionDrainingPolicy(
    enabled: NonEmptyProperty[Boolean],
    timeout: Property[Int] = Empty) extends Expression[ConnectionDrainingPolicy] {
  def render: Formattable = Value(
    "Enabled" -> enabled,
    "Timeout" -> timeout
  )
}
