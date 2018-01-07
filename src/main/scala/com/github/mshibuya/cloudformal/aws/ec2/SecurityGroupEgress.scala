package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html
 */

trait SecurityGroupEgress extends Resource {
  val resourceTypeName = "AWS::EC2::SecurityGroupEgress"

  def cidrIp: Property[String] = Empty
  def cidrIpv6: Property[String] = Empty
  def description: Property[String] = Empty
  def destinationPrefixListId: Property[String] = Empty
  def destinationSecurityGroupId: Property[String] = Empty
  def fromPort: Property[Int] = Empty
  def groupId: NonEmptyProperty[String]
  def ipProtocol: NonEmptyProperty[String]
  def toPort: Property[Int] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CidrIp" -> cidrIp,
    "CidrIpv6" -> cidrIpv6,
    "Description" -> description,
    "DestinationPrefixListId" -> destinationPrefixListId,
    "DestinationSecurityGroupId" -> destinationSecurityGroupId,
    "FromPort" -> fromPort,
    "GroupId" -> groupId,
    "IpProtocol" -> ipProtocol,
    "ToPort" -> toPort
  )
}
