package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html
 */

case class CustomizedMetricSpecification(
    dimensions: Option[Seq[MetricDimension]] = None,
    metricName: String,
    namespace: String,
    statistic: String,
    unit: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Dimensions" -> dimensions.map(Formattable(_)),
    "MetricName" -> Some(Formattable(metricName)),
    "Namespace" -> Some(Formattable(namespace)),
    "Statistic" -> Some(Formattable(statistic)),
    "Unit" -> unit.map(Formattable(_))
  )
}
