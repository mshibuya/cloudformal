package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html
 */

trait Subnet extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::Subnet"

  def availabilityZoneAttribute: Expression[String] = Fn.GetAtt(logicalId, "AvailabilityZone")
  def ipv6CidrBlocksAttribute: Expression[Seq[String]] = Fn.GetAtt(logicalId, "Ipv6CidrBlocks")
  def networkAclAssociationIdAttribute: Expression[String] = Fn.GetAtt(logicalId, "NetworkAclAssociationId")
  def vpcIdAttribute: Expression[String] = Fn.GetAtt(logicalId, "VpcId")

  def assignIpv6AddressOnCreation: Property[Boolean] = Empty
  def availabilityZone: Property[String] = Empty
  def cidrBlock: NonEmptyProperty[String]
  def ipv6CidrBlock: Property[String] = Empty
  def mapPublicIpOnLaunch: Property[Boolean] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def vpcId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AssignIpv6AddressOnCreation" -> assignIpv6AddressOnCreation,
    "AvailabilityZone" -> availabilityZone,
    "CidrBlock" -> cidrBlock,
    "Ipv6CidrBlock" -> ipv6CidrBlock,
    "MapPublicIpOnLaunch" -> mapPublicIpOnLaunch,
    "Tags" -> tags,
    "VpcId" -> vpcId
  )
}
