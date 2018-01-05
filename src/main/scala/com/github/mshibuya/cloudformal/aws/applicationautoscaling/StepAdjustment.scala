package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html
 */

case class StepAdjustment(
    metricIntervalLowerBound: Option[Double] = None,
    metricIntervalUpperBound: Option[Double] = None,
    scalingAdjustment: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MetricIntervalLowerBound" -> metricIntervalLowerBound.map(Formattable(_)),
    "MetricIntervalUpperBound" -> metricIntervalUpperBound.map(Formattable(_)),
    "ScalingAdjustment" -> Some(Formattable(scalingAdjustment))
  )
}
