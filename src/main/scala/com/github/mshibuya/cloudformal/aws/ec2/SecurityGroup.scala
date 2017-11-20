package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html
 */

trait SecurityGroup extends Resource {
  val resourceType = "AWS::EC2::SecurityGroup"

  def groupName: Option[String] = None
  def groupDescription: String
  def securityGroupEgress: Option[Seq[EC2SecurityGroupRule]] = None
  def securityGroupIngress: Option[Seq[EC2SecurityGroupRule]] = None
  def tags: Option[Seq[Tag]] = None
  def vpcId: String

  def properties: FormattableMap = Formattable.opt(
    "GroupName" -> groupName.map(Formattable(_)),
    "GroupDescription" -> Some(Formattable(groupDescription)),
    "SecurityGroupEgress" -> securityGroupEgress.map(Formattable(_)),
    "SecurityGroupIngress" -> securityGroupIngress.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "VpcId" -> Some(Formattable(vpcId))
  )
}
