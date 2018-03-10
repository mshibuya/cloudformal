package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html
 */

case class Rule(
    scanEnabled: Property[Boolean] = Empty,
    recipients: Property[Seq[String]] = Empty,
    actions: Property[Seq[Action]] = Empty,
    enabled: Property[Boolean] = Empty,
    name: Property[String] = Empty,
    tlsPolicy: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ScanEnabled" -> scanEnabled,
    "Recipients" -> recipients,
    "Actions" -> actions,
    "Enabled" -> enabled,
    "Name" -> name,
    "TlsPolicy" -> tlsPolicy
  )
}
