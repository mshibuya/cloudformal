package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html
 */

case class StepScalingPolicyConfiguration(
    adjustmentType: Option[String] = None,
    cooldown: Option[Int] = None,
    metricAggregationType: Option[String] = None,
    minAdjustmentMagnitude: Option[Int] = None,
    stepAdjustments: Option[Seq[StepAdjustment]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AdjustmentType" -> adjustmentType.map(Formattable(_)),
    "Cooldown" -> cooldown.map(Formattable(_)),
    "MetricAggregationType" -> metricAggregationType.map(Formattable(_)),
    "MinAdjustmentMagnitude" -> minAdjustmentMagnitude.map(Formattable(_)),
    "StepAdjustments" -> stepAdjustments.map(Formattable(_))
  )
}
