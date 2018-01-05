package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html
 */

trait DBSecurityGroup extends Resource {
  val resourceTypeName = "AWS::RDS::DBSecurityGroup"

  def dBSecurityGroupIngress: Seq[Ingress]
  def eC2VpcId: Option[String] = None
  def groupDescription: String
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "DBSecurityGroupIngress" -> Some(Formattable(dBSecurityGroupIngress)),
    "EC2VpcId" -> eC2VpcId.map(Formattable(_)),
    "GroupDescription" -> Some(Formattable(groupDescription)),
    "Tags" -> tags.map(Formattable(_))
  )
}
