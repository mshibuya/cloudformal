package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html
 */

trait VPNGatewayRoutePropagation extends Resource {
  val resourceTypeName = "AWS::EC2::VPNGatewayRoutePropagation"

  def routeTableIds: NonEmptyProperty[Seq[String]]
  def vpnGatewayId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "RouteTableIds" -> routeTableIds,
    "VpnGatewayId" -> vpnGatewayId
  )
}
