package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html
 */

case class RoutingStrategy(
    fleetId: Property[String] = Empty,
    message: Property[String] = Empty,
    `type`: NonEmptyProperty[String]) extends Expression[RoutingStrategy] {
  def render: Formattable = Value(
    "FleetId" -> fleetId,
    "Message" -> message,
    "Type" -> `type`
  )
}
