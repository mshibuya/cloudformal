package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html
 */

case class JobCommand(
    scriptLocation: Option[String] = None,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ScriptLocation" -> scriptLocation.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
