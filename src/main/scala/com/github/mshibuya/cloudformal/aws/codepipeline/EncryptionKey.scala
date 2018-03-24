package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html
 */

case class EncryptionKey(
    id: NonEmptyProperty[String],
    `type`: NonEmptyProperty[String]) extends Expression[EncryptionKey] {
  def render: Formattable = Value(
    "Id" -> id,
    "Type" -> `type`
  )
}
