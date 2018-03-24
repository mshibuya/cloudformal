package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetags.html
 */

case class HostedZoneTag(
    key: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Expression[HostedZoneTag] {
  def render: Formattable = Value(
    "Key" -> key,
    "Value" -> value
  )
}
