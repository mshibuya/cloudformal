package com.github.mshibuya.cloudformal.model

case class Export[A](
    name: String,
    value: NonEmptyProperty[A]) extends Expression[Export[A]] {

  def render(): Formattable = Value(
    name -> value
  )

  def importValue: Fn.ImportValue = Fn.ImportValue(Value(name))
}