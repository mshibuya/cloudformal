package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html
 */

case class LoadBasedAutoScaling(
    downScaling: Option[AutoScalingThresholds] = None,
    enable: Option[Boolean] = None,
    upScaling: Option[AutoScalingThresholds] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DownScaling" -> downScaling.map(Formattable(_)),
    "Enable" -> enable.map(Formattable(_)),
    "UpScaling" -> upScaling.map(Formattable(_))
  )
}
