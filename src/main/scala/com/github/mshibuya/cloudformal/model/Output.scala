package com.github.mshibuya.cloudformal.model

case class Output[A](
    logicalId: String,
    value: NonEmptyProperty[A],
    description: Property[String] = Empty) extends Renderable {

  def render(): Formattable = Formattable.withProperties(
    "Description" -> description,
    "Value" -> value
  )
}