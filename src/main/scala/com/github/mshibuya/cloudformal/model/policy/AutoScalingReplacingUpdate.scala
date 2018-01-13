package com.github.mshibuya.cloudformal.model.policy

import com.github.mshibuya.cloudformal.model._

case class AutoScalingReplacingUpdate(
    willReplace: Property[Boolean] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "WillReplace" -> willReplace
  )
}

