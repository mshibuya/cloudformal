package com.github.mshibuya.cloudformal.aws.efs

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html
 */

trait FileSystem extends Resource[FileSystem] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EFS::FileSystem"

  def encrypted: Property[Boolean] = Empty
  def fileSystemTags: Property[Seq[ElasticFileSystemTag]] = Empty
  def kmsKeyId: Property[String] = Empty
  def performanceMode: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "Encrypted" -> encrypted,
    "FileSystemTags" -> fileSystemTags,
    "KmsKeyId" -> kmsKeyId,
    "PerformanceMode" -> performanceMode
  )
}
