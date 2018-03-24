package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html
 */

case class AlarmIdentifier(
    name: NonEmptyProperty[String],
    region: NonEmptyProperty[String]) extends Expression[AlarmIdentifier] {
  def render: Formattable = Value(
    "Name" -> name,
    "Region" -> region
  )
}
