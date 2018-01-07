package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html
 */

case class MountPoint(
    containerPath: Property[String] = Empty,
    readOnly: Property[Boolean] = Empty,
    sourceVolume: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ContainerPath" -> containerPath,
    "ReadOnly" -> readOnly,
    "SourceVolume" -> sourceVolume
  )
}
