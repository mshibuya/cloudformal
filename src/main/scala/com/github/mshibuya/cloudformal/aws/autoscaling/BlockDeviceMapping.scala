package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html
 */

case class BlockDeviceMapping(
    deviceName: String,
    ebs: Option[BlockDevice] = None,
    noDevice: Option[Boolean] = None,
    virtualName: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DeviceName" -> Some(Formattable(deviceName)),
    "Ebs" -> ebs.map(Formattable(_)),
    "NoDevice" -> noDevice.map(Formattable(_)),
    "VirtualName" -> virtualName.map(Formattable(_))
  )
}
