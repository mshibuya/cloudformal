package com.github.mshibuya.cloudformal.model

case class Output[A](
    logicalId: String,
    value: NonEmptyProperty[A],
    description: Property[String] = Empty,
    export: Property[Export[A]] = Empty) extends Expression[Output[A]] {

  def render(): Formattable = Value(
    "Description" -> description,
    "Value" -> value,
    "Export" -> export
  )
}