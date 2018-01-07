package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html
 */

case class RoutingStrategy(
    fleetId: Property[String] = Empty,
    message: Property[String] = Empty,
    `type`: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "FleetId" -> fleetId,
    "Message" -> message,
    "Type" -> `type`
  )
}
