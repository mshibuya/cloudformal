package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html
 */

case class LoadBasedAutoScaling(
    downScaling: Property[AutoScalingThresholds] = Empty,
    enable: Property[Boolean] = Empty,
    upScaling: Property[AutoScalingThresholds] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DownScaling" -> downScaling,
    "Enable" -> enable,
    "UpScaling" -> upScaling
  )
}
