package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html
 */

trait SecurityGroupIngress extends Resource {
  val resourceTypeName = "AWS::ElastiCache::SecurityGroupIngress"

  def cacheSecurityGroupName: String
  def eC2SecurityGroupName: String
  def eC2SecurityGroupOwnerId: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CacheSecurityGroupName" -> Some(Formattable(cacheSecurityGroupName)),
    "EC2SecurityGroupName" -> Some(Formattable(eC2SecurityGroupName)),
    "EC2SecurityGroupOwnerId" -> eC2SecurityGroupOwnerId.map(Formattable(_))
  )
}
