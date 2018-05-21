package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html
 */

case class PrivateIpAdd(
    privateIpAddress: Property[String] = Empty,
    primary: Property[Boolean] = Empty) extends Expression[PrivateIpAdd] {
  def render: Formattable = Value(
    "PrivateIpAddress" -> privateIpAddress,
    "Primary" -> primary
  )
}
