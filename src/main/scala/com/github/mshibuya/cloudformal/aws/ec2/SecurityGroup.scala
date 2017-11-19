package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

trait SecurityGroup extends Resource {
  val resourceType = "AWS::EC2::SecurityGroup"

  def groupName: Option[String] = None
  def groupDescription: String
  def securityGroupEgress: Option[String] = None
  def securityGroupIngress: Option[String] = None
  def tags: Option[String] = None
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
