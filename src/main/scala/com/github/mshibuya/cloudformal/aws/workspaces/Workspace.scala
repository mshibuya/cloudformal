package com.github.mshibuya.cloudformal.aws.workspaces

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html
 */

trait Workspace extends Resource[Workspace] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::WorkSpaces::Workspace"

  def bundleId: NonEmptyProperty[String]
  def directoryId: NonEmptyProperty[String]
  def rootVolumeEncryptionEnabled: Property[Boolean] = Empty
  def userName: NonEmptyProperty[String]
  def userVolumeEncryptionEnabled: Property[Boolean] = Empty
  def volumeEncryptionKey: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "BundleId" -> bundleId,
    "DirectoryId" -> directoryId,
    "RootVolumeEncryptionEnabled" -> rootVolumeEncryptionEnabled,
    "UserName" -> userName,
    "UserVolumeEncryptionEnabled" -> userVolumeEncryptionEnabled,
    "VolumeEncryptionKey" -> volumeEncryptionKey
  )
}
