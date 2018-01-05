package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html
 */

case class RoutingStrategy(
    fleetId: Option[String] = None,
    message: Option[String] = None,
    `type`: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "FleetId" -> fleetId.map(Formattable(_)),
    "Message" -> message.map(Formattable(_)),
    "Type" -> Some(Formattable(`type`))
  )
}
