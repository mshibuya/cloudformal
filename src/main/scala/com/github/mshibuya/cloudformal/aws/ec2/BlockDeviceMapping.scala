package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html
 */

case class BlockDeviceMapping(
    deviceName: NonEmptyProperty[String],
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
