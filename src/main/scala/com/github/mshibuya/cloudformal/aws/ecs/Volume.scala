package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html
 */

case class Volume(
    host: Option[HostVolumeProperties] = None,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Host" -> host.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
