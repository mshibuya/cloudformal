package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html
 */

trait Service extends Resource {
  val resourceTypeName = "AWS::ServiceDiscovery::Service"

  def description: Option[String] = None
  def dnsConfig: DnsConfig
  def healthCheckConfig: Option[HealthCheckConfig] = None
  def name: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "DnsConfig" -> Some(Formattable(dnsConfig)),
    "HealthCheckConfig" -> healthCheckConfig.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
