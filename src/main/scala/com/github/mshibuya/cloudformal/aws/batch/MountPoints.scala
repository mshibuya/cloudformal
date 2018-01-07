package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html
 */

case class MountPoints(
    readOnly: Property[Boolean] = Empty,
    sourceVolume: Property[String] = Empty,
    containerPath: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ReadOnly" -> readOnly,
    "SourceVolume" -> sourceVolume,
    "ContainerPath" -> containerPath
  )
}
