package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html
 */

case class SerdeInfo(
    parameters: Property[Json] = Empty,
    serializationLibrary: Property[String] = Empty,
    name: Property[String] = Empty) extends Expression[SerdeInfo] {
  def render: Formattable = Value(
    "Parameters" -> parameters,
    "SerializationLibrary" -> serializationLibrary,
    "Name" -> name
  )
}
