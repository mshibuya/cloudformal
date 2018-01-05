package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html
 */

case class Action(
    jobName: Option[String] = None,
    arguments: Option[Json] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "JobName" -> jobName.map(Formattable(_)),
    "Arguments" -> arguments.map(Formattable(_))
  )
}
