package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html
 */

case class EC2MountPoint(
    device: String,
    volumeId: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Device" -> Some(Formattable(device)),
    "VolumeId" -> Some(Formattable(volumeId))
  )
}
