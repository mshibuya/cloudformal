package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html
 */

trait Route extends Resource {
  val resourceTypeName = "AWS::EC2::Route"

  def destinationCidrBlock: Option[String] = None
  def destinationIpv6CidrBlock: Option[String] = None
  def egressOnlyInternetGatewayId: Option[String] = None
  def gatewayId: Option[String] = None
  def instanceId: Option[String] = None
  def natGatewayId: Option[String] = None
  def networkInterfaceId: Option[String] = None
  def routeTableId: String
  def vpcPeeringConnectionId: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "DestinationCidrBlock" -> destinationCidrBlock.map(Formattable(_)),
    "DestinationIpv6CidrBlock" -> destinationIpv6CidrBlock.map(Formattable(_)),
    "EgressOnlyInternetGatewayId" -> egressOnlyInternetGatewayId.map(Formattable(_)),
    "GatewayId" -> gatewayId.map(Formattable(_)),
    "InstanceId" -> instanceId.map(Formattable(_)),
    "NatGatewayId" -> natGatewayId.map(Formattable(_)),
    "NetworkInterfaceId" -> networkInterfaceId.map(Formattable(_)),
    "RouteTableId" -> Some(Formattable(routeTableId)),
    "VpcPeeringConnectionId" -> vpcPeeringConnectionId.map(Formattable(_))
  )
}
