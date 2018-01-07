package com.github.mshibuya.cloudformal.aws.efs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html
 */

trait MountTarget extends Resource {
  val resourceTypeName = "AWS::EFS::MountTarget"

  def fileSystemId: NonEmptyProperty[String]
  def ipAddress: Property[String] = Empty
  def securityGroups: NonEmptyProperty[Seq[String]]
  def subnetId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "FileSystemId" -> fileSystemId,
    "IpAddress" -> ipAddress,
    "SecurityGroups" -> securityGroups,
    "SubnetId" -> subnetId
  )
}
