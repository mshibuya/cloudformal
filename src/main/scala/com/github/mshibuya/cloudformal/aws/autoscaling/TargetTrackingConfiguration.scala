package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html
 */

case class TargetTrackingConfiguration(
    customizedMetricSpecification: Property[CustomizedMetricSpecification] = Empty,
    disableScaleIn: Property[Boolean] = Empty,
    predefinedMetricSpecification: Property[PredefinedMetricSpecification] = Empty,
    targetValue: NonEmptyProperty[Double]) extends Expression[TargetTrackingConfiguration] {
  def render: Formattable = Value(
    "CustomizedMetricSpecification" -> customizedMetricSpecification,
    "DisableScaleIn" -> disableScaleIn,
    "PredefinedMetricSpecification" -> predefinedMetricSpecification,
    "TargetValue" -> targetValue
  )
}
