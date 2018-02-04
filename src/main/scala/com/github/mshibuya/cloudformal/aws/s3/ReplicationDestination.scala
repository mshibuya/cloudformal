package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html
 */

case class ReplicationDestination(
    accessControlTranslation: Property[AccessControlTranslation] = Empty,
    account: Property[String] = Empty,
    bucket: NonEmptyProperty[String],
    encryptionConfiguration: Property[EncryptionConfiguration] = Empty,
    storageClass: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AccessControlTranslation" -> accessControlTranslation,
    "Account" -> account,
    "Bucket" -> bucket,
    "EncryptionConfiguration" -> encryptionConfiguration,
    "StorageClass" -> storageClass
  )
}
