package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html
 */

case class ElasticsearchRetryOptions(
    durationInSeconds: NonEmptyProperty[Int]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DurationInSeconds" -> durationInSeconds
  )
}
