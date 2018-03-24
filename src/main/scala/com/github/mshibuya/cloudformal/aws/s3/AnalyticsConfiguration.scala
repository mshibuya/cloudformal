package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html
 */

case class AnalyticsConfiguration(
    id: NonEmptyProperty[String],
    prefix: Property[String] = Empty,
    storageClassAnalysis: NonEmptyProperty[StorageClassAnalysis],
    tagFilters: Property[Seq[TagFilter]] = Empty) extends Expression[AnalyticsConfiguration] {
  def render: Formattable = Value(
    "Id" -> id,
    "Prefix" -> prefix,
    "StorageClassAnalysis" -> storageClassAnalysis,
    "TagFilters" -> tagFilters
  )
}
