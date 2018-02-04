package com.github.mshibuya.cloudformal.model

case class Export[A](
    name: String,
    value: NonEmptyProperty[A]) extends Renderable {

  def render(): Formattable = Formattable.withProperties(
    name -> value
  )

  def importValue: Fn.ImportValue = Fn.ImportValue(Value(name))
}