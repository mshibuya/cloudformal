package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html
 */

case class BlockDeviceMapping(
    deviceName: String,
    ebs: Option[EbsBlockDevice] = None,
    noDevice: Option[String] = None,
    virtualName: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DeviceName" -> Some(Formattable(deviceName)),
    "Ebs" -> ebs.map(Formattable(_)),
    "NoDevice" -> noDevice.map(Formattable(_)),
    "VirtualName" -> virtualName.map(Formattable(_))
  )
}
