package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html
 */

trait VPCCidrBlock extends Resource {
  val resourceTypeName = "AWS::EC2::VPCCidrBlock"

  def amazonProvidedIpv6CidrBlock: Option[Boolean] = None
  def cidrBlock: Option[String] = None
  def vpcId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "AmazonProvidedIpv6CidrBlock" -> amazonProvidedIpv6CidrBlock.map(Formattable(_)),
    "CidrBlock" -> cidrBlock.map(Formattable(_)),
    "VpcId" -> Some(Formattable(vpcId))
  )
}
