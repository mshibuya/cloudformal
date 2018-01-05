package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html
 */

case class AnalyticsConfiguration(
    id: String,
    prefix: Option[String] = None,
    storageClassAnalysis: StorageClassAnalysis,
    tagFilters: Option[Seq[TagFilter]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Id" -> Some(Formattable(id)),
    "Prefix" -> prefix.map(Formattable(_)),
    "StorageClassAnalysis" -> Some(Formattable(storageClassAnalysis)),
    "TagFilters" -> tagFilters.map(Formattable(_))
  )
}
