package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html
 */

case class LifecycleEventConfiguration(
    shutdownEventConfiguration: Option[ShutdownEventConfiguration] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ShutdownEventConfiguration" -> shutdownEventConfiguration.map(Formattable(_))
  )
}
