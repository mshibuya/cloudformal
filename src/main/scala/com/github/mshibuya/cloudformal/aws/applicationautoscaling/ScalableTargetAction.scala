package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html
 */

case class ScalableTargetAction(
    maxCapacity: Property[Int] = Empty,
    minCapacity: Property[Int] = Empty) extends Expression[ScalableTargetAction] {
  def render: Formattable = Value(
    "MaxCapacity" -> maxCapacity,
    "MinCapacity" -> minCapacity
  )
}
