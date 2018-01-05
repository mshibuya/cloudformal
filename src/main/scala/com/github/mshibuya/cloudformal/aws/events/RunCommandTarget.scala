package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html
 */

case class RunCommandTarget(
    key: String,
    values: Seq[String]) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Key" -> Some(Formattable(key)),
    "Values" -> Some(Formattable(values))
  )
}
