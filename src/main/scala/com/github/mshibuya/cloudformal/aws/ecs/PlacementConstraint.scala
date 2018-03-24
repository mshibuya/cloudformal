package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html
 */

case class PlacementConstraint(
    expression: Property[String] = Empty,
    `type`: NonEmptyProperty[String]) extends Expression[PlacementConstraint] {
  def render: Formattable = Value(
    "Expression" -> expression,
    "Type" -> `type`
  )
}
