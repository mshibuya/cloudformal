package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html
 */

case class StepAdjustment(
    metricIntervalLowerBound: Property[Double] = Empty,
    metricIntervalUpperBound: Property[Double] = Empty,
    scalingAdjustment: NonEmptyProperty[Int]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "MetricIntervalLowerBound" -> metricIntervalLowerBound,
    "MetricIntervalUpperBound" -> metricIntervalUpperBound,
    "ScalingAdjustment" -> scalingAdjustment
  )
}
