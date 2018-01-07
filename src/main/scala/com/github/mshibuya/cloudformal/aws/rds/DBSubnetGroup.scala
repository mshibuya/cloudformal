package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html
 */

trait DBSubnetGroup extends Resource {
  val resourceTypeName = "AWS::RDS::DBSubnetGroup"

  def dBSubnetGroupDescription: NonEmptyProperty[String]
  def subnetIds: NonEmptyProperty[Seq[String]]
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DBSubnetGroupDescription" -> dBSubnetGroupDescription,
    "SubnetIds" -> subnetIds,
    "Tags" -> tags
  )
}
