package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html
 */

case class Device(
    containerPath: Property[String] = Empty,
    hostPath: NonEmptyProperty[String],
    permissions: Property[Seq[String]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ContainerPath" -> containerPath,
    "HostPath" -> hostPath,
    "Permissions" -> permissions
  )
}
