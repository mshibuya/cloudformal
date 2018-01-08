package com.github.mshibuya.cloudformal.model

trait Mapping extends Renderable {
  def logicalId: String
}

case class StringMapping(logicalId: String, value: Map[String, Map[String, String]]) extends Mapping {
  def render(): Formattable = Formattable(value)
}

case class ListMapping(logicalId: String, value: Map[String, Map[String, Seq[String]]]) extends Mapping {
  def render(): Formattable = Formattable(value)
}
