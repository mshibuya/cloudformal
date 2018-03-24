package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html
 */

case class StreamSpecification(
    streamViewType: NonEmptyProperty[String]) extends Expression[StreamSpecification] {
  def render: Formattable = Value(
    "StreamViewType" -> streamViewType
  )
}
