package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html
 */

case class MountPoint(
    containerPath: Option[String] = None,
    readOnly: Option[Boolean] = None,
    sourceVolume: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ContainerPath" -> containerPath.map(Formattable(_)),
    "ReadOnly" -> readOnly.map(Formattable(_)),
    "SourceVolume" -> sourceVolume.map(Formattable(_))
  )
}
