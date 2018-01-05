package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html
 */

case class PredefinedMetricSpecification(
    predefinedMetricType: String,
    resourceLabel: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "PredefinedMetricType" -> Some(Formattable(predefinedMetricType)),
    "ResourceLabel" -> resourceLabel.map(Formattable(_))
  )
}
