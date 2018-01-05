package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html
 */

case class Egress(
    cidrIp: Option[String] = None,
    cidrIpv6: Option[String] = None,
    description: Option[String] = None,
    destinationPrefixListId: Option[String] = None,
    destinationSecurityGroupId: Option[String] = None,
    fromPort: Option[Int] = None,
    ipProtocol: String,
    toPort: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CidrIp" -> cidrIp.map(Formattable(_)),
    "CidrIpv6" -> cidrIpv6.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "DestinationPrefixListId" -> destinationPrefixListId.map(Formattable(_)),
    "DestinationSecurityGroupId" -> destinationSecurityGroupId.map(Formattable(_)),
    "FromPort" -> fromPort.map(Formattable(_)),
    "IpProtocol" -> Some(Formattable(ipProtocol)),
    "ToPort" -> toPort.map(Formattable(_))
  )
}
