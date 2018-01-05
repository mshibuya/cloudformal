package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html
 */

trait VPCGatewayAttachment extends Resource {
  val resourceTypeName = "AWS::EC2::VPCGatewayAttachment"

  def internetGatewayId: Option[String] = None
  def vpcId: String
  def vpnGatewayId: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "InternetGatewayId" -> internetGatewayId.map(Formattable(_)),
    "VpcId" -> Some(Formattable(vpcId)),
    "VpnGatewayId" -> vpnGatewayId.map(Formattable(_))
  )
}
