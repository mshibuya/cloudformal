package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html
 */

case class DatabaseInput(
    locationUri: Property[String] = Empty,
    description: Property[String] = Empty,
    parameters: Property[Json] = Empty,
    name: Property[String] = Empty) extends Expression[DatabaseInput] {
  def render: Formattable = Value(
    "LocationUri" -> locationUri,
    "Description" -> description,
    "Parameters" -> parameters,
    "Name" -> name
  )
}
