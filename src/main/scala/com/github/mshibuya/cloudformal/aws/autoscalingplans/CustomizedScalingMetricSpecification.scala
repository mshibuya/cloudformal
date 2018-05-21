package com.github.mshibuya.cloudformal.aws.autoscalingplans

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html
 */

case class CustomizedScalingMetricSpecification(
    metricName: NonEmptyProperty[String],
    statistic: NonEmptyProperty[String],
    dimensions: Property[Seq[MetricDimension]] = Empty,
    unit: Property[String] = Empty,
    namespace: NonEmptyProperty[String]) extends Expression[CustomizedScalingMetricSpecification] {
  def render: Formattable = Value(
    "MetricName" -> metricName,
    "Statistic" -> statistic,
    "Dimensions" -> dimensions,
    "Unit" -> unit,
    "Namespace" -> namespace
  )
}
