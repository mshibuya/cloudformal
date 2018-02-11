package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html
 */

case class DnsRecord(
    `type`: NonEmptyProperty[String],
    ttL: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Type" -> `type`,
    "TTL" -> ttL
  )
}
