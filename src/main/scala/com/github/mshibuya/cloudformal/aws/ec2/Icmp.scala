package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html
 */

case class Icmp(
    code: Option[Int] = None,
    `type`: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Code" -> code.map(Formattable(_)),
    "Type" -> `type`.map(Formattable(_))
  )
}
