package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html
 */

case class SourceSelectionCriteria(
    sseKmsEncryptedObjects: NonEmptyProperty[SseKmsEncryptedObjects]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "SseKmsEncryptedObjects" -> sseKmsEncryptedObjects
  )
}
