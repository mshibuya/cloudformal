package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html
 */

trait SecurityGroup extends Resource[SecurityGroup] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::SecurityGroup"

  object attributes {
    val groupId: Expression[String] = Fn.GetAtt(logicalId, "GroupId")
    val vpcId: Expression[String] = Fn.GetAtt(logicalId, "VpcId")
  }

  def groupDescription: NonEmptyProperty[String]
  def groupName: Property[String] = Empty
  def securityGroupEgress: Property[Seq[Egress]] = Empty
  def securityGroupIngress: Property[Seq[Ingress]] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def vpcId: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "GroupDescription" -> groupDescription,
    "GroupName" -> groupName,
    "SecurityGroupEgress" -> securityGroupEgress,
    "SecurityGroupIngress" -> securityGroupIngress,
    "Tags" -> tags,
    "VpcId" -> vpcId
  )
}
