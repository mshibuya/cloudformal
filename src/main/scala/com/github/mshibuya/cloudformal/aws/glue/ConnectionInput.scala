package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html
 */

case class ConnectionInput(
    description: Property[String] = Empty,
    connectionType: NonEmptyProperty[String],
    matchCriteria: Property[Seq[String]] = Empty,
    physicalConnectionRequirements: Property[PhysicalConnectionRequirements] = Empty,
    connectionProperties: NonEmptyProperty[Json],
    name: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Description" -> description,
    "ConnectionType" -> connectionType,
    "MatchCriteria" -> matchCriteria,
    "PhysicalConnectionRequirements" -> physicalConnectionRequirements,
    "ConnectionProperties" -> connectionProperties,
    "Name" -> name
  )
}
