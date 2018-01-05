package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html
 */

case class MetricsCollection(
    granularity: String,
    metrics: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Granularity" -> Some(Formattable(granularity)),
    "Metrics" -> metrics.map(Formattable(_))
  )
}
