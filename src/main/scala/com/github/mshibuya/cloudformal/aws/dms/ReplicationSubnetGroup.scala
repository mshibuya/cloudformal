package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html
 */

trait ReplicationSubnetGroup extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::DMS::ReplicationSubnetGroup"

  def replicationSubnetGroupDescription: NonEmptyProperty[String]
  def replicationSubnetGroupIdentifier: Property[String] = Empty
  def subnetIds: NonEmptyProperty[Seq[String]]
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ReplicationSubnetGroupDescription" -> replicationSubnetGroupDescription,
    "ReplicationSubnetGroupIdentifier" -> replicationSubnetGroupIdentifier,
    "SubnetIds" -> subnetIds,
    "Tags" -> tags
  )
}
