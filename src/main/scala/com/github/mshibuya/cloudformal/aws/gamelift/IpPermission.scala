package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html
 */

case class IpPermission(
    fromPort: Int,
    ipRange: String,
    protocol: String,
    toPort: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "FromPort" -> Some(Formattable(fromPort)),
    "IpRange" -> Some(Formattable(ipRange)),
    "Protocol" -> Some(Formattable(protocol)),
    "ToPort" -> Some(Formattable(toPort))
  )
}
