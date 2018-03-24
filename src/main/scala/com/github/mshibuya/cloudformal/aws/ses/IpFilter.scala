package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html
 */

case class IpFilter(
    policy: NonEmptyProperty[String],
    cidr: NonEmptyProperty[String]) extends Expression[IpFilter] {
  def render: Formattable = Value(
    "Policy" -> policy,
    "Cidr" -> cidr
  )
}
