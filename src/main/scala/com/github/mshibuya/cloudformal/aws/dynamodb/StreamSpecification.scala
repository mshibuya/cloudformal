package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html
 */

case class StreamSpecification(
    streamViewType: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "StreamViewType" -> Some(Formattable(streamViewType))
  )
}
