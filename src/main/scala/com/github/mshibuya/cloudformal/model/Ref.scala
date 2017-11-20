package com.github.mshibuya.cloudformal.model

case class Ref(logicalName: String) extends Renderable {
  def render: Formattable = Formattable(
    "ID" -> Formattable(logicalName)
  )
}
