package com.github.mshibuya.cloudformal.aws.efs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html
 */

trait MountTarget extends Resource {
  val resourceTypeName = "AWS::EFS::MountTarget"

  def fileSystemId: String
  def ipAddress: Option[String] = None
  def securityGroups: Seq[String]
  def subnetId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "FileSystemId" -> Some(Formattable(fileSystemId)),
    "IpAddress" -> ipAddress.map(Formattable(_)),
    "SecurityGroups" -> Some(Formattable(securityGroups)),
    "SubnetId" -> Some(Formattable(subnetId))
  )
}
