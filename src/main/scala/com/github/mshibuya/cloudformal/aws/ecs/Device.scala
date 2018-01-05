package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html
 */

case class Device(
    containerPath: Option[String] = None,
    hostPath: String,
    permissions: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ContainerPath" -> containerPath.map(Formattable(_)),
    "HostPath" -> Some(Formattable(hostPath)),
    "Permissions" -> permissions.map(Formattable(_))
  )
}
