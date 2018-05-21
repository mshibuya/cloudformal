package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html
 */

case class Ipv6Add(
    ipv6Address: Property[String] = Empty) extends Expression[Ipv6Add] {
  def render: Formattable = Value(
    "Ipv6Address" -> ipv6Address
  )
}
