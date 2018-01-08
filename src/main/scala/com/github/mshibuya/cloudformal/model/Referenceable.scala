package com.github.mshibuya.cloudformal.model

trait Referenceable[A] {
  def logicalId: String
  def ref: Ref[A] = Ref(logicalId)
}
