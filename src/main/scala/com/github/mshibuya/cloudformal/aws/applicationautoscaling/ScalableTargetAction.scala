package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html
 */

case class ScalableTargetAction(
    maxCapacity: Option[Int] = None,
    minCapacity: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MaxCapacity" -> maxCapacity.map(Formattable(_)),
    "MinCapacity" -> minCapacity.map(Formattable(_))
  )
}
