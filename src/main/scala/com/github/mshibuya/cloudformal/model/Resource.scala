package com.github.mshibuya.cloudformal.model

trait Resource extends Renderable {
  def name: String
  def resourceType: String
  def properties: FormattableMap
  def render(): FormattableMap = Formattable(
    "Type" -> Formattable(resourceType),
    "Properties" -> properties
  )
}

