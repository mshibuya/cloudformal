package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html
 */

case class TargetDescription(
    availabilityZone: Property[String] = Empty,
    id: NonEmptyProperty[String],
    port: Property[Int] = Empty) extends Expression[TargetDescription] {
  def render: Formattable = Value(
    "AvailabilityZone" -> availabilityZone,
    "Id" -> id,
    "Port" -> port
  )
}
