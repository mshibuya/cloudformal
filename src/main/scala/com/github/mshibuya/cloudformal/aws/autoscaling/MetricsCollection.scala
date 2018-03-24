package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html
 */

case class MetricsCollection(
    granularity: NonEmptyProperty[String],
    metrics: Property[Seq[String]] = Empty) extends Expression[MetricsCollection] {
  def render: Formattable = Value(
    "Granularity" -> granularity,
    "Metrics" -> metrics
  )
}
