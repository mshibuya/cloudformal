package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html
 */

trait DBSecurityGroupIngress extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::RDS::DBSecurityGroupIngress"

  def cIDRIP: Property[String] = Empty
  def dBSecurityGroupName: NonEmptyProperty[String]
  def eC2SecurityGroupId: Property[String] = Empty
  def eC2SecurityGroupName: Property[String] = Empty
  def eC2SecurityGroupOwnerId: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CIDRIP" -> cIDRIP,
    "DBSecurityGroupName" -> dBSecurityGroupName,
    "EC2SecurityGroupId" -> eC2SecurityGroupId,
    "EC2SecurityGroupName" -> eC2SecurityGroupName,
    "EC2SecurityGroupOwnerId" -> eC2SecurityGroupOwnerId
  )
}
