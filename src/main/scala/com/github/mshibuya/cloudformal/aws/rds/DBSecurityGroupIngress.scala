package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html
 */

trait DBSecurityGroupIngress extends Resource {
  val resourceTypeName = "AWS::RDS::DBSecurityGroupIngress"

  def cIDRIP: Option[String] = None
  def dBSecurityGroupName: String
  def eC2SecurityGroupId: Option[String] = None
  def eC2SecurityGroupName: Option[String] = None
  def eC2SecurityGroupOwnerId: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CIDRIP" -> cIDRIP.map(Formattable(_)),
    "DBSecurityGroupName" -> Some(Formattable(dBSecurityGroupName)),
    "EC2SecurityGroupId" -> eC2SecurityGroupId.map(Formattable(_)),
    "EC2SecurityGroupName" -> eC2SecurityGroupName.map(Formattable(_)),
    "EC2SecurityGroupOwnerId" -> eC2SecurityGroupOwnerId.map(Formattable(_))
  )
}
