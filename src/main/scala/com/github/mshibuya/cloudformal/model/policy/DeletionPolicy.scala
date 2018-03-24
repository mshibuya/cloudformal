package com.github.mshibuya.cloudformal.model.policy

import com.github.mshibuya.cloudformal.model._

object DeletionPolicy {
  sealed abstract trait Snapshotable extends Expression[Snapshotable] {
    def render: Formattable = Value(this.toString)
  }
  sealed abstract trait Standard extends Expression[Standard] with Snapshotable
  case object Delete extends Standard
  case object Retain extends Standard
  case object Snapshot extends Snapshotable
}