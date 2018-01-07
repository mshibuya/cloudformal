package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html
 */

case class BlockDeviceMapping(
    deviceName: NonEmptyProperty[String],
    ebs: Property[BlockDevice] = Empty,
    noDevice: Property[Boolean] = Empty,
    virtualName: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DeviceName" -> deviceName,
    "Ebs" -> ebs,
    "NoDevice" -> noDevice,
    "VirtualName" -> virtualName
  )
}
