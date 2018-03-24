package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html
 */

case class CustomizedMetricSpecification(
    dimensions: Property[Seq[MetricDimension]] = Empty,
    metricName: NonEmptyProperty[String],
    namespace: NonEmptyProperty[String],
    statistic: NonEmptyProperty[String],
    unit: Property[String] = Empty) extends Expression[CustomizedMetricSpecification] {
  def render: Formattable = Value(
    "Dimensions" -> dimensions,
    "MetricName" -> metricName,
    "Namespace" -> namespace,
    "Statistic" -> statistic,
    "Unit" -> unit
  )
}
