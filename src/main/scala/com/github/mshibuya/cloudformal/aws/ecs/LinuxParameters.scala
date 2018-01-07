package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html
 */

case class LinuxParameters(
    capabilities: Property[KernelCapabilities] = Empty,
    devices: Property[Seq[Device]] = Empty,
    initProcessEnabled: Property[Boolean] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Capabilities" -> capabilities,
    "Devices" -> devices,
    "InitProcessEnabled" -> initProcessEnabled
  )
}
