package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html
 */

case class HealthCheckConfig(
    alarmIdentifier: Option[AlarmIdentifier] = None,
    childHealthChecks: Option[Seq[String]] = None,
    enableSNI: Option[Boolean] = None,
    failureThreshold: Option[Int] = None,
    fullyQualifiedDomainName: Option[String] = None,
    healthThreshold: Option[Int] = None,
    iPAddress: Option[String] = None,
    insufficientDataHealthStatus: Option[String] = None,
    inverted: Option[Boolean] = None,
    measureLatency: Option[Boolean] = None,
    port: Option[Int] = None,
    requestInterval: Option[Int] = None,
    resourcePath: Option[String] = None,
    searchString: Option[String] = None,
    `type`: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AlarmIdentifier" -> alarmIdentifier.map(Formattable(_)),
    "ChildHealthChecks" -> childHealthChecks.map(Formattable(_)),
    "EnableSNI" -> enableSNI.map(Formattable(_)),
    "FailureThreshold" -> failureThreshold.map(Formattable(_)),
    "FullyQualifiedDomainName" -> fullyQualifiedDomainName.map(Formattable(_)),
    "HealthThreshold" -> healthThreshold.map(Formattable(_)),
    "IPAddress" -> iPAddress.map(Formattable(_)),
    "InsufficientDataHealthStatus" -> insufficientDataHealthStatus.map(Formattable(_)),
    "Inverted" -> inverted.map(Formattable(_)),
    "MeasureLatency" -> measureLatency.map(Formattable(_)),
    "Port" -> port.map(Formattable(_)),
    "RequestInterval" -> requestInterval.map(Formattable(_)),
    "ResourcePath" -> resourcePath.map(Formattable(_)),
    "SearchString" -> searchString.map(Formattable(_)),
    "Type" -> Some(Formattable(`type`))
  )
}
