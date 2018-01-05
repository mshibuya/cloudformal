package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html
 */

case class VpnTunnelOptionsSpecification(
    preSharedKey: Option[String] = None,
    tunnelInsideCidr: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "PreSharedKey" -> preSharedKey.map(Formattable(_)),
    "TunnelInsideCidr" -> tunnelInsideCidr.map(Formattable(_))
  )
}
