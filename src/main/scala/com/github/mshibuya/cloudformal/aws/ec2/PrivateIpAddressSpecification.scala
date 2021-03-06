package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html
 */

case class PrivateIpAddressSpecification(
    primary: NonEmptyProperty[Boolean],
    privateIpAddress: NonEmptyProperty[String]) extends Expression[PrivateIpAddressSpecification] {
  def render: Formattable = Value(
    "Primary" -> primary,
    "PrivateIpAddress" -> privateIpAddress
  )
}
