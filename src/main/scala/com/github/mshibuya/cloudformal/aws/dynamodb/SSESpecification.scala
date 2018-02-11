package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html
 */

case class SSESpecification(
    sseEnabled: NonEmptyProperty[Boolean]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "SSEEnabled" -> sseEnabled
  )
}
