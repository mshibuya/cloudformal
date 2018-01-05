package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html
 */

trait SecurityGroupIngress extends Resource {
  val resourceTypeName = "AWS::EC2::SecurityGroupIngress"

  def cidrIp: Option[String] = None
  def cidrIpv6: Option[String] = None
  def description: Option[String] = None
  def fromPort: Option[Int] = None
  def groupId: Option[String] = None
  def groupName: Option[String] = None
  def ipProtocol: String
  def sourceSecurityGroupId: Option[String] = None
  def sourceSecurityGroupName: Option[String] = None
  def sourceSecurityGroupOwnerId: Option[String] = None
  def toPort: Option[Int] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CidrIp" -> cidrIp.map(Formattable(_)),
    "CidrIpv6" -> cidrIpv6.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "FromPort" -> fromPort.map(Formattable(_)),
    "GroupId" -> groupId.map(Formattable(_)),
    "GroupName" -> groupName.map(Formattable(_)),
    "IpProtocol" -> Some(Formattable(ipProtocol)),
    "SourceSecurityGroupId" -> sourceSecurityGroupId.map(Formattable(_)),
    "SourceSecurityGroupName" -> sourceSecurityGroupName.map(Formattable(_)),
    "SourceSecurityGroupOwnerId" -> sourceSecurityGroupOwnerId.map(Formattable(_)),
    "ToPort" -> toPort.map(Formattable(_))
  )
}
