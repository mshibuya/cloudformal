package com.github.mshibuya.cloudformal.aws.efs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html
 */

trait FileSystem extends Resource {
  val resourceTypeName = "AWS::EFS::FileSystem"

  def encrypted: Option[Boolean] = None
  def fileSystemTags: Option[Seq[ElasticFileSystemTag]] = None
  def kmsKeyId: Option[String] = None
  def performanceMode: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Encrypted" -> encrypted.map(Formattable(_)),
    "FileSystemTags" -> fileSystemTags.map(Formattable(_)),
    "KmsKeyId" -> kmsKeyId.map(Formattable(_)),
    "PerformanceMode" -> performanceMode.map(Formattable(_))
  )
}
