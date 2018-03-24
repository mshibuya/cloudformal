package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html
 */

case class ShutdownEventConfiguration(
    delayUntilElbConnectionsDrained: Property[Boolean] = Empty,
    executionTimeout: Property[Int] = Empty) extends Expression[ShutdownEventConfiguration] {
  def render: Formattable = Value(
    "DelayUntilElbConnectionsDrained" -> delayUntilElbConnectionsDrained,
    "ExecutionTimeout" -> executionTimeout
  )
}
