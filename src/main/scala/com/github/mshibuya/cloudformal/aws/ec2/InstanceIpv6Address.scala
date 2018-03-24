package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instanceipv6address.html
 */

case class InstanceIpv6Address(
    ipv6Address: NonEmptyProperty[String]) extends Expression[InstanceIpv6Address] {
  def render: Formattable = Value(
    "Ipv6Address" -> ipv6Address
  )
}
