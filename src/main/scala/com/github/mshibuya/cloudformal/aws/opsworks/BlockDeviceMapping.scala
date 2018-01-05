package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html
 */

case class BlockDeviceMapping(
    deviceName: Option[String] = None,
    ebs: Option[EbsBlockDevice] = None,
    noDevice: Option[String] = None,
    virtualName: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DeviceName" -> deviceName.map(Formattable(_)),
    "Ebs" -> ebs.map(Formattable(_)),
    "NoDevice" -> noDevice.map(Formattable(_)),
    "VirtualName" -> virtualName.map(Formattable(_))
  )
}
