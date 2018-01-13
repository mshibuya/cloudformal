package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html
 */

trait SecurityGroupIngress extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ElastiCache::SecurityGroupIngress"

  def cacheSecurityGroupName: NonEmptyProperty[String]
  def eC2SecurityGroupName: NonEmptyProperty[String]
  def eC2SecurityGroupOwnerId: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CacheSecurityGroupName" -> cacheSecurityGroupName,
    "EC2SecurityGroupName" -> eC2SecurityGroupName,
    "EC2SecurityGroupOwnerId" -> eC2SecurityGroupOwnerId
  )
}
