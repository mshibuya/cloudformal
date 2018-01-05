package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html
 */

case class LinuxParameters(
    capabilities: Option[KernelCapabilities] = None,
    devices: Option[Seq[Device]] = None,
    initProcessEnabled: Option[Boolean] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Capabilities" -> capabilities.map(Formattable(_)),
    "Devices" -> devices.map(Formattable(_)),
    "InitProcessEnabled" -> initProcessEnabled.map(Formattable(_))
  )
}
