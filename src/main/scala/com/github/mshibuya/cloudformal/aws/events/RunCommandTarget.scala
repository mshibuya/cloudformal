package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html
 */

case class RunCommandTarget(
    key: NonEmptyProperty[String],
    values: NonEmptyProperty[Seq[String]]) extends Expression[RunCommandTarget] {
  def render: Formattable = Value(
    "Key" -> key,
    "Values" -> values
  )
}
