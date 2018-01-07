package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html
 */

case class VpnTunnelOptionsSpecification(
    preSharedKey: Property[String] = Empty,
    tunnelInsideCidr: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "PreSharedKey" -> preSharedKey,
    "TunnelInsideCidr" -> tunnelInsideCidr
  )
}
