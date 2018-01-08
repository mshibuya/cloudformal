package com.github.mshibuya.cloudformal.model

trait Stack extends Renderable {
  def name: String

  def filename: String = name

  def description: String

  def parameters: Seq[Parameter[_, _]]
  def mappings: Seq[Mapping]
  def resources: Seq[Resource]
  def outputs: Seq[Output[_]]

  def render(): FormattableMap = Formattable(
    "AWSTemplateFormatVersion" -> Formattable("2010-09-09"),
    "Description" -> Formattable(description),
    "Parameters" -> Formattable(parameters.map(p => p.logicalId -> p.render()): _*),
    "Mappings" -> Formattable(mappings.map(m => m.logicalId -> m.render()): _*),
    "Resources" -> Formattable(resources.map(r => r.logicalId -> r.render()): _*),
    "Outputs" -> Formattable(outputs.map(o => o.logicalId -> o.render()): _*)
  )
}
