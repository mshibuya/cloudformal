package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html
 */

case class PredefinedMetricSpecification(
    predefinedMetricType: String,
    resourceLabel: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "PredefinedMetricType" -> Some(Formattable(predefinedMetricType)),
    "ResourceLabel" -> resourceLabel.map(Formattable(_))
  )
}
