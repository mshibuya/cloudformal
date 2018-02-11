package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html
 */

case class AliasTarget(
    dnsName: NonEmptyProperty[String],
    evaluateTargetHealth: Property[Boolean] = Empty,
    hostedZoneId: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DNSName" -> dnsName,
    "EvaluateTargetHealth" -> evaluateTargetHealth,
    "HostedZoneId" -> hostedZoneId
  )
}
