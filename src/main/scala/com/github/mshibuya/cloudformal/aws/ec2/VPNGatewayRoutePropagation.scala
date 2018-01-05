package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html
 */

trait VPNGatewayRoutePropagation extends Resource {
  val resourceTypeName = "AWS::EC2::VPNGatewayRoutePropagation"

  def routeTableIds: Seq[String]
  def vpnGatewayId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "RouteTableIds" -> Some(Formattable(routeTableIds)),
    "VpnGatewayId" -> Some(Formattable(vpnGatewayId))
  )
}
