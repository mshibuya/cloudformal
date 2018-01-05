package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html
 */

case class SerdeInfo(
    parameters: Option[Json] = None,
    serializationLibrary: Option[String] = None,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Parameters" -> parameters.map(Formattable(_)),
    "SerializationLibrary" -> serializationLibrary.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
