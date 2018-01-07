package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html
 */

trait ParameterGroup extends Resource {
  val resourceTypeName = "AWS::ElastiCache::ParameterGroup"

  def cacheParameterGroupFamily: NonEmptyProperty[String]
  def description: NonEmptyProperty[String]
  def properties: Property[ListMap[String, String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CacheParameterGroupFamily" -> cacheParameterGroupFamily,
    "Description" -> description,
    "Properties" -> properties
  )
}
