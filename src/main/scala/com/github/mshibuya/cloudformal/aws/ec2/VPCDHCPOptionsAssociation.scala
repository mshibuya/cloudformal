package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html
 */

trait VPCDHCPOptionsAssociation extends Resource {
  val resourceTypeName = "AWS::EC2::VPCDHCPOptionsAssociation"

  def dhcpOptionsId: NonEmptyProperty[String]
  def vpcId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DhcpOptionsId" -> dhcpOptionsId,
    "VpcId" -> vpcId
  )
}
