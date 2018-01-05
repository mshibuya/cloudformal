package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html
 */

case class DatabaseInput(
    locationUri: Option[String] = None,
    description: Option[String] = None,
    parameters: Option[Json] = None,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "LocationUri" -> locationUri.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "Parameters" -> parameters.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
