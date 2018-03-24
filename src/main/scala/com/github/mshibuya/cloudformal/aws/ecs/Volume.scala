package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html
 */

case class Volume(
    host: Property[HostVolumeProperties] = Empty,
    name: Property[String] = Empty) extends Expression[Volume] {
  def render: Formattable = Value(
    "Host" -> host,
    "Name" -> name
  )
}
