package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html
 */

case class ArtifactStore(
    encryptionKey: Property[EncryptionKey] = Empty,
    location: NonEmptyProperty[String],
    `type`: NonEmptyProperty[String]) extends Expression[ArtifactStore] {
  def render: Formattable = Value(
    "EncryptionKey" -> encryptionKey,
    "Location" -> location,
    "Type" -> `type`
  )
}
