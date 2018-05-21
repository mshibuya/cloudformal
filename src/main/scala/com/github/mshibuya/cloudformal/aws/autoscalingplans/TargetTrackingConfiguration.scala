package com.github.mshibuya.cloudformal.aws.autoscalingplans

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html
 */

case class TargetTrackingConfiguration(
    scaleOutCooldown: Property[Int] = Empty,
    targetValue: NonEmptyProperty[Double],
    predefinedScalingMetricSpecification: Property[PredefinedScalingMetricSpecification] = Empty,
    disableScaleIn: Property[Boolean] = Empty,
    scaleInCooldown: Property[Int] = Empty,
    estimatedInstanceWarmup: Property[Int] = Empty,
    customizedScalingMetricSpecification: Property[CustomizedScalingMetricSpecification] = Empty) extends Expression[TargetTrackingConfiguration] {
  def render: Formattable = Value(
    "ScaleOutCooldown" -> scaleOutCooldown,
    "TargetValue" -> targetValue,
    "PredefinedScalingMetricSpecification" -> predefinedScalingMetricSpecification,
    "DisableScaleIn" -> disableScaleIn,
    "ScaleInCooldown" -> scaleInCooldown,
    "EstimatedInstanceWarmup" -> estimatedInstanceWarmup,
    "CustomizedScalingMetricSpecification" -> customizedScalingMetricSpecification
  )
}
