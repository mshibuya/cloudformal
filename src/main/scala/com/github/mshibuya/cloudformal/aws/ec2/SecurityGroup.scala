package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html
 */

trait SecurityGroup extends Resource {
  val resourceTypeName = "AWS::EC2::SecurityGroup"

  def groupDescription: String
  def groupName: Option[String] = None
  def securityGroupEgress: Option[Seq[Egress]] = None
  def securityGroupIngress: Option[Seq[Ingress]] = None
  def tags: Option[Seq[Tag]] = None
  def vpcId: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "GroupDescription" -> Some(Formattable(groupDescription)),
    "GroupName" -> groupName.map(Formattable(_)),
    "SecurityGroupEgress" -> securityGroupEgress.map(Formattable(_)),
    "SecurityGroupIngress" -> securityGroupIngress.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "VpcId" -> vpcId.map(Formattable(_))
  )
}
