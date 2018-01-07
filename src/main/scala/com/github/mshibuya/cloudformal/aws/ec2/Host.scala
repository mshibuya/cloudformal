package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html
 */

trait Host extends Resource {
  val resourceTypeName = "AWS::EC2::Host"

  def autoPlacement: Property[String] = Empty
  def availabilityZone: NonEmptyProperty[String]
  def instanceType: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AutoPlacement" -> autoPlacement,
    "AvailabilityZone" -> availabilityZone,
    "InstanceType" -> instanceType
  )
}
