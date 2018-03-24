package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html
 */

case class SimpleScalingPolicyConfiguration(
    adjustmentType: Property[String] = Empty,
    coolDown: Property[Int] = Empty,
    scalingAdjustment: NonEmptyProperty[Int]) extends Expression[SimpleScalingPolicyConfiguration] {
  def render: Formattable = Value(
    "AdjustmentType" -> adjustmentType,
    "CoolDown" -> coolDown,
    "ScalingAdjustment" -> scalingAdjustment
  )
}
