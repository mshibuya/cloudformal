package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html
 */

trait DBSubnetGroup extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::RDS::DBSubnetGroup"

  def dBSubnetGroupDescription: NonEmptyProperty[String]
  def dBSubnetGroupName: Property[String] = Empty
  def subnetIds: NonEmptyProperty[Seq[String]]
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DBSubnetGroupDescription" -> dBSubnetGroupDescription,
    "DBSubnetGroupName" -> dBSubnetGroupName,
    "SubnetIds" -> subnetIds,
    "Tags" -> tags
  )
}
