package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html
 */

case class BucketEncryption(
    serverSideEncryptionConfiguration: NonEmptyProperty[Seq[ServerSideEncryptionRule]]) extends Expression[BucketEncryption] {
  def render: Formattable = Value(
    "ServerSideEncryptionConfiguration" -> serverSideEncryptionConfiguration
  )
}
