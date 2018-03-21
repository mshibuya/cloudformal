package com.github.mshibuya.cloudformal.model

case class Tag(key: NonEmptyProperty[String], value: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Key" -> key,
    "Value" -> value
  )
}

object Tag {
  def apply(pairs: (String, NonEmptyProperty[String])*): Seq[Tag] = pairs.collect {
    case (key, value) => Tag(Value(key), value)
  }

  def apply(pairs: Map[String, NonEmptyProperty[String]]): Seq[Tag] = apply(pairs.toSeq: _*)
}
