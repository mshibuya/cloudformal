package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html
 */

trait VolumeAttachment extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::VolumeAttachment"

  def device: NonEmptyProperty[String]
  def instanceId: NonEmptyProperty[String]
  def volumeId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Device" -> device,
    "InstanceId" -> instanceId,
    "VolumeId" -> volumeId
  )
}
