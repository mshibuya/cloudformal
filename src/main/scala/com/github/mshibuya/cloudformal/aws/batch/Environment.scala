package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html
 */

case class Environment(
    value: Property[String] = Empty,
    name: Property[String] = Empty) extends Expression[Environment] {
  def render: Formattable = Value(
    "Value" -> value,
    "Name" -> name
  )
}
