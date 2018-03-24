package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html
 */

trait SubnetGroup extends Resource[SubnetGroup] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ElastiCache::SubnetGroup"

  def cacheSubnetGroupName: Property[String] = Empty
  def description: NonEmptyProperty[String]
  def subnetIds: NonEmptyProperty[Seq[String]]

  def render(): MapValue[_] = Value(
    "CacheSubnetGroupName" -> cacheSubnetGroupName,
    "Description" -> description,
    "SubnetIds" -> subnetIds
  )
}
