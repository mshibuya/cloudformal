package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html
 */

case class BlockDeviceMapping(
    deviceName: Property[String] = Empty,
    ebs: Property[EbsBlockDevice] = Empty,
    noDevice: Property[String] = Empty,
    virtualName: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DeviceName" -> deviceName,
    "Ebs" -> ebs,
    "NoDevice" -> noDevice,
    "VirtualName" -> virtualName
  )
}
