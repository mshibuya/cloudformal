package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html
 */

trait Service extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ServiceDiscovery::Service"

  def idAttribute: Expression[String] = Fn.GetAtt(logicalId, "Id")
  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  def nameAttribute: Expression[String] = Fn.GetAtt(logicalId, "Name")

  def description: Property[String] = Empty
  def dnsConfig: NonEmptyProperty[DnsConfig]
  def healthCheckConfig: Property[HealthCheckConfig] = Empty
  def name: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "DnsConfig" -> dnsConfig,
    "HealthCheckConfig" -> healthCheckConfig,
    "Name" -> name
  )
}
