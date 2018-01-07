package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html
 */

case class DnsConfig(
    dnsRecords: NonEmptyProperty[Seq[DnsRecord]],
    namespaceId: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DnsRecords" -> dnsRecords,
    "NamespaceId" -> namespaceId
  )
}
