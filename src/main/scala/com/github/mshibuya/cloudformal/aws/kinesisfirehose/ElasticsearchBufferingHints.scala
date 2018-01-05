package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
 */

case class ElasticsearchBufferingHints(
    intervalInSeconds: Int,
    sizeInMBs: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "IntervalInSeconds" -> Some(Formattable(intervalInSeconds)),
    "SizeInMBs" -> Some(Formattable(sizeInMBs))
  )
}
