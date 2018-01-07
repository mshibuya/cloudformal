package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html
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
