package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html
 */

case class AliasTarget(
    dNSName: String,
    evaluateTargetHealth: Option[Boolean] = None,
    hostedZoneId: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DNSName" -> Some(Formattable(dNSName)),
    "EvaluateTargetHealth" -> evaluateTargetHealth.map(Formattable(_)),
    "HostedZoneId" -> Some(Formattable(hostedZoneId))
  )
}
