package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html
 */

case class KinesisParameters(
    partitionKeyPath: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "PartitionKeyPath" -> partitionKeyPath
  )
}
