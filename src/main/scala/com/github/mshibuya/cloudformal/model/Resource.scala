package com.github.mshibuya.cloudformal.model

trait Resource extends Renderable with Referenceable{
  def logicalId: String
  def resourceTypeName: String
  def resourceProperties: FormattableMap
  def render(): FormattableMap = Formattable(
    "Type" -> Formattable(resourceTypeName),
    "Properties" -> resourceProperties
  )
}

