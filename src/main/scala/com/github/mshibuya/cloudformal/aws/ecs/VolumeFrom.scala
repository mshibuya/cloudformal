package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html
 */

case class VolumeFrom(
    readOnly: Option[Boolean] = None,
    sourceContainer: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ReadOnly" -> readOnly.map(Formattable(_)),
    "SourceContainer" -> sourceContainer.map(Formattable(_))
  )
}
