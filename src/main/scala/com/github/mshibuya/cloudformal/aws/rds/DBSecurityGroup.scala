package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html
 */

trait DBSecurityGroup extends Resource[DBSecurityGroup] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::RDS::DBSecurityGroup"

  def dbSecurityGroupIngress: NonEmptyProperty[Seq[Ingress]]
  def eC2VpcId: Property[String] = Empty
  def groupDescription: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty

  def render(): MapValue[_] = Value(
    "DBSecurityGroupIngress" -> dbSecurityGroupIngress,
    "EC2VpcId" -> eC2VpcId,
    "GroupDescription" -> groupDescription,
    "Tags" -> tags
  )
}
