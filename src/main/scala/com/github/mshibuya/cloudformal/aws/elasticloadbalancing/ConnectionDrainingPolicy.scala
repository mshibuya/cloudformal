package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html
 */

case class ConnectionDrainingPolicy(
    enabled: Boolean,
    timeout: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Enabled" -> Some(Formattable(enabled)),
    "Timeout" -> timeout.map(Formattable(_))
  )
}
