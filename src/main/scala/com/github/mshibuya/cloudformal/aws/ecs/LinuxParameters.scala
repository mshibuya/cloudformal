package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html
 */

case class LinuxParameters(
    capabilities: Property[KernelCapabilities] = Empty,
    devices: Property[Seq[Device]] = Empty,
    initProcessEnabled: Property[Boolean] = Empty) extends Expression[LinuxParameters] {
  def render: Formattable = Value(
    "Capabilities" -> capabilities,
    "Devices" -> devices,
    "InitProcessEnabled" -> initProcessEnabled
  )
}
