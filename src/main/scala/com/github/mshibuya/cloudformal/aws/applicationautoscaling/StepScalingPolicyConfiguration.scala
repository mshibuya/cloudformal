package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html
 */

case class StepScalingPolicyConfiguration(
    adjustmentType: Property[String] = Empty,
    cooldown: Property[Int] = Empty,
    metricAggregationType: Property[String] = Empty,
    minAdjustmentMagnitude: Property[Int] = Empty,
    stepAdjustments: Property[Seq[StepAdjustment]] = Empty) extends Expression[StepScalingPolicyConfiguration] {
  def render: Formattable = Value(
    "AdjustmentType" -> adjustmentType,
    "Cooldown" -> cooldown,
    "MetricAggregationType" -> metricAggregationType,
    "MinAdjustmentMagnitude" -> minAdjustmentMagnitude,
    "StepAdjustments" -> stepAdjustments
  )
}
