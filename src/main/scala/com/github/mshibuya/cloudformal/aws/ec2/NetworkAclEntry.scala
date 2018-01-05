package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html
 */

trait NetworkAclEntry extends Resource {
  val resourceTypeName = "AWS::EC2::NetworkAclEntry"

  def cidrBlock: String
  def egress: Option[Boolean] = None
  def icmp: Option[Icmp] = None
  def ipv6CidrBlock: Option[String] = None
  def networkAclId: String
  def portRange: Option[PortRange] = None
  def protocol: Int
  def ruleAction: String
  def ruleNumber: Int

  def resourceProperties: FormattableMap = Formattable.opt(
    "CidrBlock" -> Some(Formattable(cidrBlock)),
    "Egress" -> egress.map(Formattable(_)),
    "Icmp" -> icmp.map(Formattable(_)),
    "Ipv6CidrBlock" -> ipv6CidrBlock.map(Formattable(_)),
    "NetworkAclId" -> Some(Formattable(networkAclId)),
    "PortRange" -> portRange.map(Formattable(_)),
    "Protocol" -> Some(Formattable(protocol)),
    "RuleAction" -> Some(Formattable(ruleAction)),
    "RuleNumber" -> Some(Formattable(ruleNumber))
  )
}
