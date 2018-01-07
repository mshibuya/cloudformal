package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html
 */

case class Egress(
    cidrIp: Property[String] = Empty,
    cidrIpv6: Property[String] = Empty,
    description: Property[String] = Empty,
    destinationPrefixListId: Property[String] = Empty,
    destinationSecurityGroupId: Property[String] = Empty,
    fromPort: Property[Int] = Empty,
    ipProtocol: NonEmptyProperty[String],
    toPort: Property[Int] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "CidrIp" -> cidrIp,
    "CidrIpv6" -> cidrIpv6,
    "Description" -> description,
    "DestinationPrefixListId" -> destinationPrefixListId,
    "DestinationSecurityGroupId" -> destinationSecurityGroupId,
    "FromPort" -> fromPort,
    "IpProtocol" -> ipProtocol,
    "ToPort" -> toPort
  )
}
