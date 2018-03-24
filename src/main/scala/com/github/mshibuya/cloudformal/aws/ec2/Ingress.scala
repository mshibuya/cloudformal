package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html
 */

case class Ingress(
    cidrIp: Property[String] = Empty,
    cidrIpv6: Property[String] = Empty,
    description: Property[String] = Empty,
    fromPort: Property[Int] = Empty,
    ipProtocol: NonEmptyProperty[String],
    sourceSecurityGroupId: Property[String] = Empty,
    sourceSecurityGroupName: Property[String] = Empty,
    sourceSecurityGroupOwnerId: Property[String] = Empty,
    toPort: Property[Int] = Empty) extends Expression[Ingress] {
  def render: Formattable = Value(
    "CidrIp" -> cidrIp,
    "CidrIpv6" -> cidrIpv6,
    "Description" -> description,
    "FromPort" -> fromPort,
    "IpProtocol" -> ipProtocol,
    "SourceSecurityGroupId" -> sourceSecurityGroupId,
    "SourceSecurityGroupName" -> sourceSecurityGroupName,
    "SourceSecurityGroupOwnerId" -> sourceSecurityGroupOwnerId,
    "ToPort" -> toPort
  )
}
