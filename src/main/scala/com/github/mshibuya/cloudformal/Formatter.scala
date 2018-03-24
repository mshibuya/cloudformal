package com.github.mshibuya.cloudformal

import argonaut._
import com.github.mshibuya.cloudformal.model._

trait Formatter {
  def format(formattable: Formattable): String
  def extension: String
}

case class JsonFormatter() extends Formatter with EncodeJsons {
  val extension = "json"
  val prettyParams = PrettyParams.spaces2.copy(preserveOrder = true)

  def format(formattable: Formattable) = formattable.toJson.pretty(prettyParams)
}