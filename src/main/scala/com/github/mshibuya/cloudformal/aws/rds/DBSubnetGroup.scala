package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html
 */

trait DBSubnetGroup extends Resource {
  val resourceTypeName = "AWS::RDS::DBSubnetGroup"

  def dBSubnetGroupDescription: String
  def subnetIds: Seq[String]
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "DBSubnetGroupDescription" -> Some(Formattable(dBSubnetGroupDescription)),
    "SubnetIds" -> Some(Formattable(subnetIds)),
    "Tags" -> tags.map(Formattable(_))
  )
}
