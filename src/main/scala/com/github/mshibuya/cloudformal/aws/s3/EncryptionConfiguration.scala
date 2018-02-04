package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html
 */

case class EncryptionConfiguration(
    replicaKmsKeyID: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ReplicaKmsKeyID" -> replicaKmsKeyID
  )
}
