package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-environment.html
 */

case class KeyValuePair(
    name: Property[String] = Empty,
    value: Property[String] = Empty) extends Expression[KeyValuePair] {
  def render: Formattable = Value(
    "Name" -> name,
    "Value" -> value
  )
}
