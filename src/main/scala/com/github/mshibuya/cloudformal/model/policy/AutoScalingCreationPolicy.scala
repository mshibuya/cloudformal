package com.github.mshibuya.cloudformal.model.policy

import com.github.mshibuya.cloudformal.model._

case class AutoScalingCreationPolicy(
    minSuccessfulInstancesPercent: Property[Int] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "MinSuccessfulInstancesPercent" -> minSuccessfulInstancesPercent
  )
}

