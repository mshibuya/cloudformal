package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html
 */

case class PredefinedMetricSpecification(
    predefinedMetricType: NonEmptyProperty[String],
    resourceLabel: Property[String] = Empty) extends Expression[PredefinedMetricSpecification] {
  def render: Formattable = Value(
    "PredefinedMetricType" -> predefinedMetricType,
    "ResourceLabel" -> resourceLabel
  )
}
