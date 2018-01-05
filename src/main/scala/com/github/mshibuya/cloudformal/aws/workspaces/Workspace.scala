package com.github.mshibuya.cloudformal.aws.workspaces

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html
 */

trait Workspace extends Resource {
  val resourceTypeName = "AWS::WorkSpaces::Workspace"

  def bundleId: String
  def directoryId: String
  def rootVolumeEncryptionEnabled: Option[Boolean] = None
  def userName: String
  def userVolumeEncryptionEnabled: Option[Boolean] = None
  def volumeEncryptionKey: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "BundleId" -> Some(Formattable(bundleId)),
    "DirectoryId" -> Some(Formattable(directoryId)),
    "RootVolumeEncryptionEnabled" -> rootVolumeEncryptionEnabled.map(Formattable(_)),
    "UserName" -> Some(Formattable(userName)),
    "UserVolumeEncryptionEnabled" -> userVolumeEncryptionEnabled.map(Formattable(_)),
    "VolumeEncryptionKey" -> volumeEncryptionKey.map(Formattable(_))
  )
}
