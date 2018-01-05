package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html
 */

trait ElasticLoadBalancerAttachment extends Resource {
  val resourceTypeName = "AWS::OpsWorks::ElasticLoadBalancerAttachment"

  def elasticLoadBalancerName: String
  def layerId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "ElasticLoadBalancerName" -> Some(Formattable(elasticLoadBalancerName)),
    "LayerId" -> Some(Formattable(layerId))
  )
}
