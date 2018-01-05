package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html
 */

trait ParameterGroup extends Resource {
  val resourceTypeName = "AWS::ElastiCache::ParameterGroup"

  def cacheParameterGroupFamily: String
  def description: String
  def properties: Option[ListMap[String, String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CacheParameterGroupFamily" -> Some(Formattable(cacheParameterGroupFamily)),
    "Description" -> Some(Formattable(description)),
    "Properties" -> properties.map(Formattable(_))
  )
}
