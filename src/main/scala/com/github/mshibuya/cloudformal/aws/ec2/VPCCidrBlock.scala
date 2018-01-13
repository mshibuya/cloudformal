package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html
 */

trait VPCCidrBlock extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::VPCCidrBlock"

  def amazonProvidedIpv6CidrBlock: Property[Boolean] = Empty
  def cidrBlock: Property[String] = Empty
  def vpcId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AmazonProvidedIpv6CidrBlock" -> amazonProvidedIpv6CidrBlock,
    "CidrBlock" -> cidrBlock,
    "VpcId" -> vpcId
  )
}
