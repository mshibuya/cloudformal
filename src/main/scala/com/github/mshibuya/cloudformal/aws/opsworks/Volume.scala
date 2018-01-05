package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html
 */

trait Volume extends Resource {
  val resourceTypeName = "AWS::OpsWorks::Volume"

  def ec2VolumeId: String
  def mountPoint: Option[String] = None
  def name: Option[String] = None
  def stackId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Ec2VolumeId" -> Some(Formattable(ec2VolumeId)),
    "MountPoint" -> mountPoint.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "StackId" -> Some(Formattable(stackId))
  )
}
