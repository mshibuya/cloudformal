package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html
 */

case class DnsConfig(
    dnsRecords: NonEmptyProperty[Seq[DnsRecord]],
    namespaceId: NonEmptyProperty[String]) extends Expression[DnsConfig] {
  def render: Formattable = Value(
    "DnsRecords" -> dnsRecords,
    "NamespaceId" -> namespaceId
  )
}
