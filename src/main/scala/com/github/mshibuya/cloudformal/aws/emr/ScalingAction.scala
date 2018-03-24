package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html
 */

case class ScalingAction(
    market: Property[String] = Empty,
    simpleScalingPolicyConfiguration: NonEmptyProperty[SimpleScalingPolicyConfiguration]) extends Expression[ScalingAction] {
  def render: Formattable = Value(
    "Market" -> market,
    "SimpleScalingPolicyConfiguration" -> simpleScalingPolicyConfiguration
  )
}
