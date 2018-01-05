package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html
 */

trait SubnetGroup extends Resource {
  val resourceTypeName = "AWS::ElastiCache::SubnetGroup"

  def cacheSubnetGroupName: Option[String] = None
  def description: String
  def subnetIds: Seq[String]

  def resourceProperties: FormattableMap = Formattable.opt(
    "CacheSubnetGroupName" -> cacheSubnetGroupName.map(Formattable(_)),
    "Description" -> Some(Formattable(description)),
    "SubnetIds" -> Some(Formattable(subnetIds))
  )
}
