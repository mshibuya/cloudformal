package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html
 */

case class PortMapping(
    containerPort: Option[Int] = None,
    hostPort: Option[Int] = None,
    protocol: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ContainerPort" -> containerPort.map(Formattable(_)),
    "HostPort" -> hostPort.map(Formattable(_)),
    "Protocol" -> protocol.map(Formattable(_))
  )
}
