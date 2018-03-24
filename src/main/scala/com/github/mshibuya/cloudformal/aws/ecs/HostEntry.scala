package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html
 */

case class HostEntry(
    hostname: NonEmptyProperty[String],
    ipAddress: NonEmptyProperty[String]) extends Expression[HostEntry] {
  def render: Formattable = Value(
    "Hostname" -> hostname,
    "IpAddress" -> ipAddress
  )
}
