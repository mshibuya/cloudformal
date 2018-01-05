package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html
 */

case class DnsConfig(
    dnsRecords: Seq[DnsRecord],
    namespaceId: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DnsRecords" -> Some(Formattable(dnsRecords)),
    "NamespaceId" -> Some(Formattable(namespaceId))
  )
}
