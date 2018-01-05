package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html
 */

case class ShutdownEventConfiguration(
    delayUntilElbConnectionsDrained: Option[Boolean] = None,
    executionTimeout: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DelayUntilElbConnectionsDrained" -> delayUntilElbConnectionsDrained.map(Formattable(_)),
    "ExecutionTimeout" -> executionTimeout.map(Formattable(_))
  )
}
