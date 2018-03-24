package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html
 */

trait ClusterSubnetGroup extends Resource[ClusterSubnetGroup] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Redshift::ClusterSubnetGroup"

  def description: NonEmptyProperty[String]
  def subnetIds: NonEmptyProperty[Seq[String]]
  def tags: Property[Seq[Tag]] = Empty

  def render(): MapValue[_] = Value(
    "Description" -> description,
    "SubnetIds" -> subnetIds,
    "Tags" -> tags
  )
}
