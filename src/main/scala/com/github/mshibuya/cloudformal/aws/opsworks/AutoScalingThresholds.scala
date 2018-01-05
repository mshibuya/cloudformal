package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
 */

case class AutoScalingThresholds(
    cpuThreshold: Option[Double] = None,
    ignoreMetricsTime: Option[Int] = None,
    instanceCount: Option[Int] = None,
    loadThreshold: Option[Double] = None,
    memoryThreshold: Option[Double] = None,
    thresholdsWaitTime: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CpuThreshold" -> cpuThreshold.map(Formattable(_)),
    "IgnoreMetricsTime" -> ignoreMetricsTime.map(Formattable(_)),
    "InstanceCount" -> instanceCount.map(Formattable(_)),
    "LoadThreshold" -> loadThreshold.map(Formattable(_)),
    "MemoryThreshold" -> memoryThreshold.map(Formattable(_)),
    "ThresholdsWaitTime" -> thresholdsWaitTime.map(Formattable(_))
  )
}
