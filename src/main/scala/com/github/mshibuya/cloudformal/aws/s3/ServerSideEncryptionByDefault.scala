package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html
 */

case class ServerSideEncryptionByDefault(
    kMSMasterKeyID: Property[String] = Empty,
    sSEAlgorithm: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "KMSMasterKeyID" -> kMSMasterKeyID,
    "SSEAlgorithm" -> sSEAlgorithm
  )
}
