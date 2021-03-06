package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html
 */

case class RunCommandParameters(
    runCommandTargets: NonEmptyProperty[Seq[RunCommandTarget]]) extends Expression[RunCommandParameters] {
  def render: Formattable = Value(
    "RunCommandTargets" -> runCommandTargets
  )
}
