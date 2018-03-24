package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html
 */

case class Filter(
    ipFilter: NonEmptyProperty[IpFilter],
    name: Property[String] = Empty) extends Expression[Filter] {
  def render: Formattable = Value(
    "IpFilter" -> ipFilter,
    "Name" -> name
  )
}
