package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html
 */

case class ScalingAction(
    market: Property[String] = Empty,
    simpleScalingPolicyConfiguration: NonEmptyProperty[SimpleScalingPolicyConfiguration]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Market" -> market,
    "SimpleScalingPolicyConfiguration" -> simpleScalingPolicyConfiguration
  )
}
