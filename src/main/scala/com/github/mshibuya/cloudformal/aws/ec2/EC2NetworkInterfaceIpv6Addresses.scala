package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-ipv6addresses.html
 */

case class EC2NetworkInterfaceIpv6Addresses(
    ipv6Address: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Ipv6Address" -> Some(Formattable(ipv6Address))
  )
}
