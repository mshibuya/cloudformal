package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html
 */

trait SecurityGroupIngress extends Resource[SecurityGroupIngress] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::SecurityGroupIngress"

  def cidrIp: Property[String] = Empty
  def cidrIpv6: Property[String] = Empty
  def description: Property[String] = Empty
  def fromPort: Property[Int] = Empty
  def groupId: Property[String] = Empty
  def groupName: Property[String] = Empty
  def ipProtocol: NonEmptyProperty[String]
  def sourceSecurityGroupId: Property[String] = Empty
  def sourceSecurityGroupName: Property[String] = Empty
  def sourceSecurityGroupOwnerId: Property[String] = Empty
  def toPort: Property[Int] = Empty

  def render(): MapValue[_] = Value(
    "CidrIp" -> cidrIp,
    "CidrIpv6" -> cidrIpv6,
    "Description" -> description,
    "FromPort" -> fromPort,
    "GroupId" -> groupId,
    "GroupName" -> groupName,
    "IpProtocol" -> ipProtocol,
    "SourceSecurityGroupId" -> sourceSecurityGroupId,
    "SourceSecurityGroupName" -> sourceSecurityGroupName,
    "SourceSecurityGroupOwnerId" -> sourceSecurityGroupOwnerId,
    "ToPort" -> toPort
  )
}
