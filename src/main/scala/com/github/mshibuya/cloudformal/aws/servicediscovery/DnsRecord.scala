package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html
 */

case class DnsRecord(
    `type`: NonEmptyProperty[String],
    ttL: NonEmptyProperty[String]) extends Expression[DnsRecord] {
  def render: Formattable = Value(
    "Type" -> `type`,
    "TTL" -> ttL
  )
}
