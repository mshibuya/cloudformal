package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html
 */

case class HostVolumeProperties(
    sourcePath: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "SourcePath" -> sourcePath.map(Formattable(_))
  )
}
