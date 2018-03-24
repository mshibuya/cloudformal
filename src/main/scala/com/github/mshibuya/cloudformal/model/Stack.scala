package com.github.mshibuya.cloudformal.model

trait Stack extends Renderable {
  def name: String

  def filename: String = name

  def description: String

  def parameters: Seq[Parameter[_, _]]
  def mappings: Seq[Mapping]
  def resources: Seq[Resource[_]]
  def outputs: Seq[Output[_]]

  def render(): FormattableMap = FormattableMap(
    "AWSTemplateFormatVersion" -> Value("2010-09-09"),
    "Description" -> Value(description),
    "Parameters" -> FormattableMap(parameters.map(p => p.logicalId -> p.render()): _*),
    "Mappings" -> FormattableMap(mappings.map(m => m.logicalId -> m.render()): _*),
    "Resources" -> FormattableMap(resources.map(r => r.logicalId -> r.resourcify()): _*),
    "Outputs" -> FormattableMap(outputs.map(o => o.logicalId -> o.render()): _*)
  )
}
