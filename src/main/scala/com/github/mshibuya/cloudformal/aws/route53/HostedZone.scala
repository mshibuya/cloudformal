package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html
 */

trait HostedZone extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Route53::HostedZone"

  object attributes {
    val nameServers: Expression[Seq[String]] = Fn.GetAtt(logicalId, "NameServers")
  }

  def hostedZoneConfig: Property[HostedZoneConfig] = Empty
  def hostedZoneTags: Property[Seq[HostedZoneTag]] = Empty
  def name: NonEmptyProperty[String]
  def queryLoggingConfig: Property[QueryLoggingConfig] = Empty
  def vpCs: Property[Seq[VPC]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "HostedZoneConfig" -> hostedZoneConfig,
    "HostedZoneTags" -> hostedZoneTags,
    "Name" -> name,
    "QueryLoggingConfig" -> queryLoggingConfig,
    "VPCs" -> vpCs
  )
}
