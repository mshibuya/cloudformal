package com.github.mshibuya.cloudformal.model

trait Mapping extends Expression[Mapping] {
  def logicalId: String

  def get(topLevelKey: NonEmptyProperty[String], secondLevelKey: NonEmptyProperty[String]): Expression[String] =
    Fn.FindInMap(this, topLevelKey = topLevelKey, secondLevelKey = secondLevelKey)
}

case class StringMapping(logicalId: String, value: Map[String, Map[String, String]]) extends Mapping {
  def render(): Formattable = Value(value.collect {
    case (k, v) => k -> Value(v.collect {
      case (l, w) => l -> Value(w)
    })
  })
}

case class ListMapping(logicalId: String, value: Map[String, Map[String, Seq[String]]]) extends Mapping {
  def render(): Formattable = Value(value.collect {
    case (k, v) => k -> Value(v.collect {
      case (l, w) => l -> Value(w.map(Value(_)))
    })
  })
}
