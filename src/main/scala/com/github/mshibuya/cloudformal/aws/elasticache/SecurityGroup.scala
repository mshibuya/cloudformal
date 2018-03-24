package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group.html
 */

trait SecurityGroup extends Resource[SecurityGroup] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ElastiCache::SecurityGroup"

  def description: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "Description" -> description
  )
}
