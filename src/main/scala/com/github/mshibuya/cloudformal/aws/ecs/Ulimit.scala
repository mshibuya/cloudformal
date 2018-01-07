package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html
 */

case class Ulimit(
    hardLimit: NonEmptyProperty[Int],
    name: NonEmptyProperty[String],
    softLimit: NonEmptyProperty[Int]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "HardLimit" -> hardLimit,
    "Name" -> name,
    "SoftLimit" -> softLimit
  )
}
