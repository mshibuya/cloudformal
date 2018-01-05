package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html
 */

trait VolumeAttachment extends Resource {
  val resourceTypeName = "AWS::EC2::VolumeAttachment"

  def device: String
  def instanceId: String
  def volumeId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Device" -> Some(Formattable(device)),
    "InstanceId" -> Some(Formattable(instanceId)),
    "VolumeId" -> Some(Formattable(volumeId))
  )
}
