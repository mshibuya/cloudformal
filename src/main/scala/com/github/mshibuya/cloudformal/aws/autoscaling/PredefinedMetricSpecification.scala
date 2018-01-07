package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html
 */

case class PredefinedMetricSpecification(
    predefinedMetricType: NonEmptyProperty[String],
    resourceLabel: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "PredefinedMetricType" -> predefinedMetricType,
    "ResourceLabel" -> resourceLabel
  )
}
