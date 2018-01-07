package com.github.mshibuya.cloudformal.model

trait Referenceable {
  def logicalId: String
  def ref: Ref[String] = Ref(logicalId)
}
