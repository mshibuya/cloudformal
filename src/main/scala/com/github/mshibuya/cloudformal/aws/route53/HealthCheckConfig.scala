package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html
 */

case class HealthCheckConfig(
    alarmIdentifier: Property[AlarmIdentifier] = Empty,
    childHealthChecks: Property[Seq[String]] = Empty,
    enableSNI: Property[Boolean] = Empty,
    failureThreshold: Property[Int] = Empty,
    fullyQualifiedDomainName: Property[String] = Empty,
    healthThreshold: Property[Int] = Empty,
    ipAddress: Property[String] = Empty,
    insufficientDataHealthStatus: Property[String] = Empty,
    inverted: Property[Boolean] = Empty,
    measureLatency: Property[Boolean] = Empty,
    port: Property[Int] = Empty,
    regions: Property[Seq[String]] = Empty,
    requestInterval: Property[Int] = Empty,
    resourcePath: Property[String] = Empty,
    searchString: Property[String] = Empty,
    `type`: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AlarmIdentifier" -> alarmIdentifier,
    "ChildHealthChecks" -> childHealthChecks,
    "EnableSNI" -> enableSNI,
    "FailureThreshold" -> failureThreshold,
    "FullyQualifiedDomainName" -> fullyQualifiedDomainName,
    "HealthThreshold" -> healthThreshold,
    "IPAddress" -> ipAddress,
    "InsufficientDataHealthStatus" -> insufficientDataHealthStatus,
    "Inverted" -> inverted,
    "MeasureLatency" -> measureLatency,
    "Port" -> port,
    "Regions" -> regions,
    "RequestInterval" -> requestInterval,
    "ResourcePath" -> resourcePath,
    "SearchString" -> searchString,
    "Type" -> `type`
  )
}
