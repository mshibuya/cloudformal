package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html
 */

case class HostVolumeProperties(
    sourcePath: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "SourcePath" -> sourcePath
  )
}
