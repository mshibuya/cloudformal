package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html
 */

case class EncryptionConfiguration(
    replicaKmsKeyID: NonEmptyProperty[String]) extends Expression[EncryptionConfiguration] {
  def render: Formattable = Value(
    "ReplicaKmsKeyID" -> replicaKmsKeyID
  )
}
