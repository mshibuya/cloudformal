package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html
 */

case class TargetDescription(
    availabilityZone: Property[String] = Empty,
    id: NonEmptyProperty[String],
    port: Property[Int] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AvailabilityZone" -> availabilityZone,
    "Id" -> id,
    "Port" -> port
  )
}
