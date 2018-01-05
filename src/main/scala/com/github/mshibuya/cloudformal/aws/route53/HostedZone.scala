package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html
 */

trait HostedZone extends Resource {
  val resourceTypeName = "AWS::Route53::HostedZone"

  def hostedZoneConfig: Option[HostedZoneConfig] = None
  def hostedZoneTags: Option[Seq[HostedZoneTag]] = None
  def name: String
  def queryLoggingConfig: Option[QueryLoggingConfig] = None
  def vPCs: Option[Seq[VPC]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "HostedZoneConfig" -> hostedZoneConfig.map(Formattable(_)),
    "HostedZoneTags" -> hostedZoneTags.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "QueryLoggingConfig" -> queryLoggingConfig.map(Formattable(_)),
    "VPCs" -> vPCs.map(Formattable(_))
  )
}
