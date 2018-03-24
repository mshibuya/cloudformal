package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html
 */

trait NetworkAclEntry extends Resource[NetworkAclEntry] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::NetworkAclEntry"

  def cidrBlock: NonEmptyProperty[String]
  def egress: Property[Boolean] = Empty
  def icmp: Property[Icmp] = Empty
  def ipv6CidrBlock: Property[String] = Empty
  def networkAclId: NonEmptyProperty[String]
  def portRange: Property[PortRange] = Empty
  def protocol: NonEmptyProperty[Int]
  def ruleAction: NonEmptyProperty[String]
  def ruleNumber: NonEmptyProperty[Int]

  def render(): MapValue[_] = Value(
    "CidrBlock" -> cidrBlock,
    "Egress" -> egress,
    "Icmp" -> icmp,
    "Ipv6CidrBlock" -> ipv6CidrBlock,
    "NetworkAclId" -> networkAclId,
    "PortRange" -> portRange,
    "Protocol" -> protocol,
    "RuleAction" -> ruleAction,
    "RuleNumber" -> ruleNumber
  )
}
