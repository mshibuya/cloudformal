package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html
 */

case class Icmp(
    code: Property[Int] = Empty,
    `type`: Property[Int] = Empty) extends Expression[Icmp] {
  def render: Formattable = Value(
    "Code" -> code,
    "Type" -> `type`
  )
}
