package com.github.mshibuya.cloudformal.model

/**
  * Substructure of Stack, useful for combining related parameters, mappings, resources, and outputs.
  */

trait SubStack {
  def parameters: Seq[Parameter[_, _]]
  def mappings: Seq[Mapping]
  def resources: Seq[Resource[_]]
  def outputs: Seq[Output[_]]
}
