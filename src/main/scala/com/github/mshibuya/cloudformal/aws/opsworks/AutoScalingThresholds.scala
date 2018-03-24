package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
 */

case class AutoScalingThresholds(
    cpuThreshold: Property[Double] = Empty,
    ignoreMetricsTime: Property[Int] = Empty,
    instanceCount: Property[Int] = Empty,
    loadThreshold: Property[Double] = Empty,
    memoryThreshold: Property[Double] = Empty,
    thresholdsWaitTime: Property[Int] = Empty) extends Expression[AutoScalingThresholds] {
  def render: Formattable = Value(
    "CpuThreshold" -> cpuThreshold,
    "IgnoreMetricsTime" -> ignoreMetricsTime,
    "InstanceCount" -> instanceCount,
    "LoadThreshold" -> loadThreshold,
    "MemoryThreshold" -> memoryThreshold,
    "ThresholdsWaitTime" -> thresholdsWaitTime
  )
}
