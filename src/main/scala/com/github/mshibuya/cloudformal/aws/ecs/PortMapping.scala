package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html
 */

case class PortMapping(
    containerPort: Property[Int] = Empty,
    hostPort: Property[Int] = Empty,
    protocol: Property[String] = Empty) extends Expression[PortMapping] {
  def render: Formattable = Value(
    "ContainerPort" -> containerPort,
    "HostPort" -> hostPort,
    "Protocol" -> protocol
  )
}
