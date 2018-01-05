package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html
 */

case class Ingress(
    cidrIp: Option[String] = None,
    cidrIpv6: Option[String] = None,
    description: Option[String] = None,
    fromPort: Option[Int] = None,
    ipProtocol: String,
    sourceSecurityGroupId: Option[String] = None,
    sourceSecurityGroupName: Option[String] = None,
    sourceSecurityGroupOwnerId: Option[String] = None,
    toPort: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CidrIp" -> cidrIp.map(Formattable(_)),
    "CidrIpv6" -> cidrIpv6.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "FromPort" -> fromPort.map(Formattable(_)),
    "IpProtocol" -> Some(Formattable(ipProtocol)),
    "SourceSecurityGroupId" -> sourceSecurityGroupId.map(Formattable(_)),
    "SourceSecurityGroupName" -> sourceSecurityGroupName.map(Formattable(_)),
    "SourceSecurityGroupOwnerId" -> sourceSecurityGroupOwnerId.map(Formattable(_)),
    "ToPort" -> toPort.map(Formattable(_))
  )
}
