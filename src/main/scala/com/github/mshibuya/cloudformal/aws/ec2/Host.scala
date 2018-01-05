package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html
 */

trait Host extends Resource {
  val resourceTypeName = "AWS::EC2::Host"

  def autoPlacement: Option[String] = None
  def availabilityZone: String
  def instanceType: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "AutoPlacement" -> autoPlacement.map(Formattable(_)),
    "AvailabilityZone" -> Some(Formattable(availabilityZone)),
    "InstanceType" -> Some(Formattable(instanceType))
  )
}
