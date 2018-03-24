package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html
 */

case class JobCommand(
    scriptLocation: Property[String] = Empty,
    name: Property[String] = Empty) extends Expression[JobCommand] {
  def render: Formattable = Value(
    "ScriptLocation" -> scriptLocation,
    "Name" -> name
  )
}
