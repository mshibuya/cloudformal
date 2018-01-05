package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html
 */

case class Volumes(
    host: Option[VolumesHost] = None,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Host" -> host.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
