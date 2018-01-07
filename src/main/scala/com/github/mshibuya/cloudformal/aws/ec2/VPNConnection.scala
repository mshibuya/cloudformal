package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html
 */

trait VPNConnection extends Resource {
  val resourceTypeName = "AWS::EC2::VPNConnection"

  def customerGatewayId: NonEmptyProperty[String]
  def staticRoutesOnly: Property[Boolean] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def `type`: NonEmptyProperty[String]
  def vpnGatewayId: NonEmptyProperty[String]
  def vpnTunnelOptionsSpecifications: Property[Seq[VpnTunnelOptionsSpecification]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CustomerGatewayId" -> customerGatewayId,
    "StaticRoutesOnly" -> staticRoutesOnly,
    "Tags" -> tags,
    "Type" -> `type`,
    "VpnGatewayId" -> vpnGatewayId,
    "VpnTunnelOptionsSpecifications" -> vpnTunnelOptionsSpecifications
  )
}
