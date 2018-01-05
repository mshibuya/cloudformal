package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html
 */

case class TargetDescription(
    availabilityZone: Option[String] = None,
    id: String,
    port: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AvailabilityZone" -> availabilityZone.map(Formattable(_)),
    "Id" -> Some(Formattable(id)),
    "Port" -> port.map(Formattable(_))
  )
}
