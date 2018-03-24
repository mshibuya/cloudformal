package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html
 */

case class ConnectionSettings(
    idleTimeout: NonEmptyProperty[Int]) extends Expression[ConnectionSettings] {
  def render: Formattable = Value(
    "IdleTimeout" -> idleTimeout
  )
}
