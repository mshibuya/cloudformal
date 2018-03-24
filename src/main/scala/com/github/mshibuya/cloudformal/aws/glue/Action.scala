package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html
 */

case class Action(
    jobName: Property[String] = Empty,
    arguments: Property[Json] = Empty) extends Expression[Action] {
  def render: Formattable = Value(
    "JobName" -> jobName,
    "Arguments" -> arguments
  )
}
