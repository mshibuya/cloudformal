package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html
 */

trait VPNConnection extends Resource {
  val resourceTypeName = "AWS::EC2::VPNConnection"

  def customerGatewayId: String
  def staticRoutesOnly: Option[Boolean] = None
  def tags: Option[Seq[Tag]] = None
  def `type`: String
  def vpnGatewayId: String
  def vpnTunnelOptionsSpecifications: Option[Seq[VpnTunnelOptionsSpecification]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CustomerGatewayId" -> Some(Formattable(customerGatewayId)),
    "StaticRoutesOnly" -> staticRoutesOnly.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "Type" -> Some(Formattable(`type`)),
    "VpnGatewayId" -> Some(Formattable(vpnGatewayId)),
    "VpnTunnelOptionsSpecifications" -> vpnTunnelOptionsSpecifications.map(Formattable(_))
  )
}
