package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html
 */

trait SecurityGroupEgress extends Resource {
  val resourceTypeName = "AWS::EC2::SecurityGroupEgress"

  def cidrIp: Option[String] = None
  def cidrIpv6: Option[String] = None
  def description: Option[String] = None
  def destinationPrefixListId: Option[String] = None
  def destinationSecurityGroupId: Option[String] = None
  def fromPort: Option[Int] = None
  def groupId: String
  def ipProtocol: String
  def toPort: Option[Int] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CidrIp" -> cidrIp.map(Formattable(_)),
    "CidrIpv6" -> cidrIpv6.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "DestinationPrefixListId" -> destinationPrefixListId.map(Formattable(_)),
    "DestinationSecurityGroupId" -> destinationSecurityGroupId.map(Formattable(_)),
    "FromPort" -> fromPort.map(Formattable(_)),
    "GroupId" -> Some(Formattable(groupId)),
    "IpProtocol" -> Some(Formattable(ipProtocol)),
    "ToPort" -> toPort.map(Formattable(_))
  )
}
