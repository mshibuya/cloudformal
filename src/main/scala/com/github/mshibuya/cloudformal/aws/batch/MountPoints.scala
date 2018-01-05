package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html
 */

case class MountPoints(
    readOnly: Option[Boolean] = None,
    sourceVolume: Option[String] = None,
    containerPath: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ReadOnly" -> readOnly.map(Formattable(_)),
    "SourceVolume" -> sourceVolume.map(Formattable(_)),
    "ContainerPath" -> containerPath.map(Formattable(_))
  )
}
