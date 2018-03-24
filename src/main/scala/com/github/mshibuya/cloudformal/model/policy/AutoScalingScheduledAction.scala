package com.github.mshibuya.cloudformal.model.policy

import com.github.mshibuya.cloudformal.model._

case class AutoScalingScheduledAction(
    ignoreUnmodifiedGroupSizeProperties: Property[Boolean] = Empty) extends Expression[AutoScalingScheduledAction] {
  def render: Formattable = Value(
    "IgnoreUnmodifiedGroupSizeProperties" -> ignoreUnmodifiedGroupSizeProperties
  )
}

