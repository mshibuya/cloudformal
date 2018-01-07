package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html
 */

case class Volumes(
    host: Property[VolumesHost] = Empty,
    name: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Host" -> host,
    "Name" -> name
  )
}
