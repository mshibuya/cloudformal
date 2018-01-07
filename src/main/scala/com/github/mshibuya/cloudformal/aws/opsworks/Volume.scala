package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html
 */

trait Volume extends Resource {
  val resourceTypeName = "AWS::OpsWorks::Volume"

  def ec2VolumeId: NonEmptyProperty[String]
  def mountPoint: Property[String] = Empty
  def name: Property[String] = Empty
  def stackId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Ec2VolumeId" -> ec2VolumeId,
    "MountPoint" -> mountPoint,
    "Name" -> name,
    "StackId" -> stackId
  )
}
