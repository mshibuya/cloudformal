package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html
 */

case class RunCommandParameters(
    runCommandTargets: Seq[RunCommandTarget]) extends Renderable {
  def render: Formattable = Formattable.opt(
    "RunCommandTargets" -> Some(Formattable(runCommandTargets))
  )
}
