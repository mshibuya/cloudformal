package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html
 */

case class PortRange(
    from: Option[Int] = None,
    to: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "From" -> from.map(Formattable(_)),
    "To" -> to.map(Formattable(_))
  )
}
