package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html
 */

trait Subnet extends Resource {
  val resourceTypeName = "AWS::EC2::Subnet"

  def assignIpv6AddressOnCreation: Option[Boolean] = None
  def availabilityZone: Option[String] = None
  def cidrBlock: String
  def ipv6CidrBlock: Option[String] = None
  def mapPublicIpOnLaunch: Option[Boolean] = None
  def tags: Option[Seq[Tag]] = None
  def vpcId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "AssignIpv6AddressOnCreation" -> assignIpv6AddressOnCreation.map(Formattable(_)),
    "AvailabilityZone" -> availabilityZone.map(Formattable(_)),
    "CidrBlock" -> Some(Formattable(cidrBlock)),
    "Ipv6CidrBlock" -> ipv6CidrBlock.map(Formattable(_)),
    "MapPublicIpOnLaunch" -> mapPublicIpOnLaunch.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "VpcId" -> Some(Formattable(vpcId))
  )
}
