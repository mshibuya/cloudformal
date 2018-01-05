package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html
 */

case class ConnectionInput(
    description: Option[String] = None,
    connectionType: String,
    matchCriteria: Option[Seq[String]] = None,
    physicalConnectionRequirements: Option[PhysicalConnectionRequirements] = None,
    connectionProperties: Json,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "ConnectionType" -> Some(Formattable(connectionType)),
    "MatchCriteria" -> matchCriteria.map(Formattable(_)),
    "PhysicalConnectionRequirements" -> physicalConnectionRequirements.map(Formattable(_)),
    "ConnectionProperties" -> Some(Formattable(connectionProperties)),
    "Name" -> name.map(Formattable(_))
  )
}
