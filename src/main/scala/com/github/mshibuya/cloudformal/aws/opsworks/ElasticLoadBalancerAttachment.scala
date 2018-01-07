package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html
 */

trait ElasticLoadBalancerAttachment extends Resource {
  val resourceTypeName = "AWS::OpsWorks::ElasticLoadBalancerAttachment"

  def elasticLoadBalancerName: NonEmptyProperty[String]
  def layerId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ElasticLoadBalancerName" -> elasticLoadBalancerName,
    "LayerId" -> layerId
  )
}
