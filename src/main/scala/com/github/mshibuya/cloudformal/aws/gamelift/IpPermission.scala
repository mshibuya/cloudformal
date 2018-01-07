package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html
 */

case class IpPermission(
    fromPort: NonEmptyProperty[Int],
    ipRange: NonEmptyProperty[String],
    protocol: NonEmptyProperty[String],
    toPort: NonEmptyProperty[Int]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "FromPort" -> fromPort,
    "IpRange" -> ipRange,
    "Protocol" -> protocol,
    "ToPort" -> toPort
  )
}
