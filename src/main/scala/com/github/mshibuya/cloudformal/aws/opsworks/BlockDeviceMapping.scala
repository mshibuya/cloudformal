package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html
 */

case class BlockDeviceMapping(
    deviceName: Property[String] = Empty,
    ebs: Property[EbsBlockDevice] = Empty,
    noDevice: Property[String] = Empty,
    virtualName: Property[String] = Empty) extends Expression[BlockDeviceMapping] {
  def render: Formattable = Value(
    "DeviceName" -> deviceName,
    "Ebs" -> ebs,
    "NoDevice" -> noDevice,
    "VirtualName" -> virtualName
  )
}
