package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html
 */

case class ShutdownEventConfiguration(
    delayUntilElbConnectionsDrained: Property[Boolean] = Empty,
    executionTimeout: Property[Int] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DelayUntilElbConnectionsDrained" -> delayUntilElbConnectionsDrained,
    "ExecutionTimeout" -> executionTimeout
  )
}
