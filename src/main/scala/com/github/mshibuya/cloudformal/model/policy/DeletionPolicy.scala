package com.github.mshibuya.cloudformal.model.policy

import com.github.mshibuya.cloudformal.model._

object DeletionPolicy {
  sealed abstract class Snapshotable extends Renderable {
    def render: Formattable = Formattable(this.toString)
  }
  sealed abstract class Standard extends Snapshotable
  case object Delete extends Standard
  case object Retain extends Standard
  case object Snapshot extends Snapshotable
}