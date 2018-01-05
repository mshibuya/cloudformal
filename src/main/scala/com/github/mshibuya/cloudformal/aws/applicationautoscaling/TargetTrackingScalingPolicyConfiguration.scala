package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html
 */

case class TargetTrackingScalingPolicyConfiguration(
    customizedMetricSpecification: Option[CustomizedMetricSpecification] = None,
    predefinedMetricSpecification: Option[PredefinedMetricSpecification] = None,
    scaleInCooldown: Option[Int] = None,
    scaleOutCooldown: Option[Int] = None,
    targetValue: Double) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CustomizedMetricSpecification" -> customizedMetricSpecification.map(Formattable(_)),
    "PredefinedMetricSpecification" -> predefinedMetricSpecification.map(Formattable(_)),
    "ScaleInCooldown" -> scaleInCooldown.map(Formattable(_)),
    "ScaleOutCooldown" -> scaleOutCooldown.map(Formattable(_)),
    "TargetValue" -> Some(Formattable(targetValue))
  )
}
