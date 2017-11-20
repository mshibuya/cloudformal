package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html
 */

case class PrivateIpAddressSpecification(
    privateIpAddress: String,
    primary: Boolean) extends Renderable {
  def render: Formattable = Formattable.opt(
    "PrivateIpAddress" -> Some(Formattable(privateIpAddress)),
    "Primary" -> Some(Formattable(primary))
  )
}
