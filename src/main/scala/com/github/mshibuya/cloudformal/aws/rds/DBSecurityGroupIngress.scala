package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html
 */

trait DBSecurityGroupIngress extends Resource[DBSecurityGroupIngress] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::RDS::DBSecurityGroupIngress"

  def cidriP: Property[String] = Empty
  def dbSecurityGroupName: NonEmptyProperty[String]
  def eC2SecurityGroupId: Property[String] = Empty
  def eC2SecurityGroupName: Property[String] = Empty
  def eC2SecurityGroupOwnerId: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "CIDRIP" -> cidriP,
    "DBSecurityGroupName" -> dbSecurityGroupName,
    "EC2SecurityGroupId" -> eC2SecurityGroupId,
    "EC2SecurityGroupName" -> eC2SecurityGroupName,
    "EC2SecurityGroupOwnerId" -> eC2SecurityGroupOwnerId
  )
}
