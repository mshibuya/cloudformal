package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html
 */

case class KinesisParameters(
    partitionKeyPath: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "PartitionKeyPath" -> Some(Formattable(partitionKeyPath))
  )
}
