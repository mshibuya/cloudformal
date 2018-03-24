package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html
 */

case class PortRange(
    from: Property[Int] = Empty,
    to: Property[Int] = Empty) extends Expression[PortRange] {
  def render: Formattable = Value(
    "From" -> from,
    "To" -> to
  )
}
