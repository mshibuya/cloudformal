package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html
 */

trait HostedZone extends Resource {
  val resourceTypeName = "AWS::Route53::HostedZone"

  def nameServersAttribute: Expression[Seq[String]] = Fn.GetAtt(logicalId, "NameServers")

  def hostedZoneConfig: Property[HostedZoneConfig] = Empty
  def hostedZoneTags: Property[Seq[HostedZoneTag]] = Empty
  def name: NonEmptyProperty[String]
  def queryLoggingConfig: Property[QueryLoggingConfig] = Empty
  def vPCs: Property[Seq[VPC]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "HostedZoneConfig" -> hostedZoneConfig,
    "HostedZoneTags" -> hostedZoneTags,
    "Name" -> name,
    "QueryLoggingConfig" -> queryLoggingConfig,
    "VPCs" -> vPCs
  )
}
