package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html
 */

case class VolumeFrom(
    readOnly: Property[Boolean] = Empty,
    sourceContainer: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ReadOnly" -> readOnly,
    "SourceContainer" -> sourceContainer
  )
}
