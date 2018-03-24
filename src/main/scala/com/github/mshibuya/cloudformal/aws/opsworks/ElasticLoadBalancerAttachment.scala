package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html
 */

trait ElasticLoadBalancerAttachment extends Resource[ElasticLoadBalancerAttachment] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::OpsWorks::ElasticLoadBalancerAttachment"

  def elasticLoadBalancerName: NonEmptyProperty[String]
  def layerId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "ElasticLoadBalancerName" -> elasticLoadBalancerName,
    "LayerId" -> layerId
  )
}
