package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthchecktag.html
 */

case class HealthCheckTag(
    key: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Expression[HealthCheckTag] {
  def render: Formattable = Value(
    "Key" -> key,
    "Value" -> value
  )
}
