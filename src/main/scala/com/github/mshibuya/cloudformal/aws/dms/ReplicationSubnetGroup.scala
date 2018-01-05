package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html
 */

trait ReplicationSubnetGroup extends Resource {
  val resourceTypeName = "AWS::DMS::ReplicationSubnetGroup"

  def replicationSubnetGroupDescription: String
  def replicationSubnetGroupIdentifier: Option[String] = None
  def subnetIds: Seq[String]
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ReplicationSubnetGroupDescription" -> Some(Formattable(replicationSubnetGroupDescription)),
    "ReplicationSubnetGroupIdentifier" -> replicationSubnetGroupIdentifier.map(Formattable(_)),
    "SubnetIds" -> Some(Formattable(subnetIds)),
    "Tags" -> tags.map(Formattable(_))
  )
}
