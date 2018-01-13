package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html
 */

trait VPCGatewayAttachment extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::VPCGatewayAttachment"

  def internetGatewayId: Property[String] = Empty
  def vpcId: NonEmptyProperty[String]
  def vpnGatewayId: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "InternetGatewayId" -> internetGatewayId,
    "VpcId" -> vpcId,
    "VpnGatewayId" -> vpnGatewayId
  )
}
