package com.github.mshibuya.cloudformal.aws.autoscalingplans

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html
 */

case class PredefinedScalingMetricSpecification(
    resourceLabel: Property[String] = Empty,
    predefinedScalingMetricType: NonEmptyProperty[String]) extends Expression[PredefinedScalingMetricSpecification] {
  def render: Formattable = Value(
    "ResourceLabel" -> resourceLabel,
    "PredefinedScalingMetricType" -> predefinedScalingMetricType
  )
}
