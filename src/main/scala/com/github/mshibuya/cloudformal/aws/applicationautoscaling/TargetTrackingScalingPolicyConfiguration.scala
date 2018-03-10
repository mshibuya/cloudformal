package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html
 */

case class TargetTrackingScalingPolicyConfiguration(
    customizedMetricSpecification: Property[CustomizedMetricSpecification] = Empty,
    disableScaleIn: Property[Boolean] = Empty,
    predefinedMetricSpecification: Property[PredefinedMetricSpecification] = Empty,
    scaleInCooldown: Property[Int] = Empty,
    scaleOutCooldown: Property[Int] = Empty,
    targetValue: NonEmptyProperty[Double]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "CustomizedMetricSpecification" -> customizedMetricSpecification,
    "DisableScaleIn" -> disableScaleIn,
    "PredefinedMetricSpecification" -> predefinedMetricSpecification,
    "ScaleInCooldown" -> scaleInCooldown,
    "ScaleOutCooldown" -> scaleOutCooldown,
    "TargetValue" -> targetValue
  )
}
