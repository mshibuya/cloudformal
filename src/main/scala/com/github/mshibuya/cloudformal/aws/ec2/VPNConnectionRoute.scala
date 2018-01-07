package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html
 */

trait VPNConnectionRoute extends Resource {
  val resourceTypeName = "AWS::EC2::VPNConnectionRoute"

  def destinationCidrBlock: NonEmptyProperty[String]
  def vpnConnectionId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DestinationCidrBlock" -> destinationCidrBlock,
    "VpnConnectionId" -> vpnConnectionId
  )
}
