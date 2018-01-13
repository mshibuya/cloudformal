package com.github.mshibuya.cloudformal.model.policy

import com.github.mshibuya.cloudformal.model._

case class ResourceSignal(
    count: Property[Int] = Empty,
    timeout: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Count" -> count,
    "Timeout" -> timeout
  )
}
