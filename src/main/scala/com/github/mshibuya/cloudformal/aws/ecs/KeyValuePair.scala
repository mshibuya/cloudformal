package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-environment.html
 */

case class KeyValuePair(
    name: Option[String] = None,
    value: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Name" -> name.map(Formattable(_)),
    "Value" -> value.map(Formattable(_))
  )
}
