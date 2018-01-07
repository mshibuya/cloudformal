package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html
 */

case class MetricsConfiguration(
    id: NonEmptyProperty[String],
    prefix: Property[String] = Empty,
    tagFilters: Property[Seq[TagFilter]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Id" -> id,
    "Prefix" -> prefix,
    "TagFilters" -> tagFilters
  )
}
