package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html
 */

case class PlacementStrategy(
    field: Property[String] = Empty,
    `type`: NonEmptyProperty[String]) extends Expression[PlacementStrategy] {
  def render: Formattable = Value(
    "Field" -> field,
    "Type" -> `type`
  )
}
