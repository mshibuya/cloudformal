package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html
 */

case class HostEntry(
    hostname: String,
    ipAddress: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Hostname" -> Some(Formattable(hostname)),
    "IpAddress" -> Some(Formattable(ipAddress))
  )
}
