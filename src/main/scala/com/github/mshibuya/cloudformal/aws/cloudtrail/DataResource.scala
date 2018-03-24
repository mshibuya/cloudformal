package com.github.mshibuya.cloudformal.aws.cloudtrail

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html
 */

case class DataResource(
    `type`: NonEmptyProperty[String],
    values: Property[Seq[String]] = Empty) extends Expression[DataResource] {
  def render: Formattable = Value(
    "Type" -> `type`,
    "Values" -> values
  )
}
