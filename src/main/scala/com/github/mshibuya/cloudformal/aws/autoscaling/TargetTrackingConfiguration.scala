package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html
 */

case class TargetTrackingConfiguration(
    customizedMetricSpecification: Option[CustomizedMetricSpecification] = None,
    disableScaleIn: Option[Boolean] = None,
    predefinedMetricSpecification: Option[PredefinedMetricSpecification] = None,
    targetValue: Double) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CustomizedMetricSpecification" -> customizedMetricSpecification.map(Formattable(_)),
    "DisableScaleIn" -> disableScaleIn.map(Formattable(_)),
    "PredefinedMetricSpecification" -> predefinedMetricSpecification.map(Formattable(_)),
    "TargetValue" -> Some(Formattable(targetValue))
  )
}
