package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html
 */

case class RunCommandTarget(
    key: NonEmptyProperty[String],
    values: NonEmptyProperty[Seq[String]]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Key" -> key,
    "Values" -> values
  )
}
