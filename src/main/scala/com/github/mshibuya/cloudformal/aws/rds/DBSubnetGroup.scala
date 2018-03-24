package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html
 */

trait DBSubnetGroup extends Resource[DBSubnetGroup] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::RDS::DBSubnetGroup"

  def dbSubnetGroupDescription: NonEmptyProperty[String]
  def dbSubnetGroupName: Property[String] = Empty
  def subnetIds: NonEmptyProperty[Seq[String]]
  def tags: Property[Seq[Tag]] = Empty

  def render(): MapValue[_] = Value(
    "DBSubnetGroupDescription" -> dbSubnetGroupDescription,
    "DBSubnetGroupName" -> dbSubnetGroupName,
    "SubnetIds" -> subnetIds,
    "Tags" -> tags
  )
}
