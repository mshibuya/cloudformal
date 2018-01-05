package com.github.mshibuya.cloudformal.model

trait Stack extends Renderable {
  def name: String

  def filename: String = name

  def description: String

  def resources: Seq[Resource]

  def render(): FormattableMap = Formattable(
    "AWSTemplateFormatVersion" -> Formattable("2010-09-09"),
    "Description" -> Formattable(description),
    "Parameters" -> Formattable.emptyMap,
    "Mappings" -> Formattable.emptyMap,
    "Resources" -> Formattable(resources.map(r => r.logicalId -> r.render()): _*),
    "Outputs" -> Formattable.emptyMap
  )
}
