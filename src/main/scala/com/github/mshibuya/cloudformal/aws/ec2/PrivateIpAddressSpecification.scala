package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html
 */

case class PrivateIpAddressSpecification(
    primary: Boolean,
    privateIpAddress: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Primary" -> Some(Formattable(primary)),
    "PrivateIpAddress" -> Some(Formattable(privateIpAddress))
  )
}
