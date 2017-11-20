package com.github.mshibuya.cloudformal.model

case class Tag(key: String, value: String) extends Renderable {
  def render: Formattable = Formattable(
    "Key" -> Formattable(key),
    "Value" -> Formattable(value)
  )
}
