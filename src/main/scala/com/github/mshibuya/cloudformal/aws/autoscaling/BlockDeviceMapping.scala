package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html
 */

case class BlockDeviceMapping(
    deviceName: NonEmptyProperty[String],
    ebs: Property[BlockDevice] = Empty,
    noDevice: Property[Boolean] = Empty,
    virtualName: Property[String] = Empty) extends Expression[BlockDeviceMapping] {
  def render: Formattable = Value(
    "DeviceName" -> deviceName,
    "Ebs" -> ebs,
    "NoDevice" -> noDevice,
    "VirtualName" -> virtualName
  )
}
