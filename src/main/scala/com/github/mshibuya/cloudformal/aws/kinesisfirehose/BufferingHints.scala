package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html
 */

case class BufferingHints(
    intervalInSeconds: NonEmptyProperty[Int],
    sizeInMBs: NonEmptyProperty[Int]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "IntervalInSeconds" -> intervalInSeconds,
    "SizeInMBs" -> sizeInMBs
  )
}
