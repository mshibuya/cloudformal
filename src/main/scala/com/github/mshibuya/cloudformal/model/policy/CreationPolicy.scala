package com.github.mshibuya.cloudformal.model.policy

import com.github.mshibuya.cloudformal.model._

case class CreationPolicy(
    autoScalingCreationPolicy: Property[AutoScalingCreationPolicy] = Empty,
    resourceSignal: Property[ResourceSignal] = Empty) extends Expression[CreationPolicy] {
  def render: Formattable = Value(
    "AutoScalingCreationPolicy" -> autoScalingCreationPolicy,
    "ResourceSignal" -> resourceSignal
  )
}