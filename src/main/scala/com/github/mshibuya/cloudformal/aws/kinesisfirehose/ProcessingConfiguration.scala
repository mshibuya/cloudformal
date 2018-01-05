package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
 */

case class ProcessingConfiguration(
    enabled: Boolean,
    processors: Seq[Processor]) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Enabled" -> Some(Formattable(enabled)),
    "Processors" -> Some(Formattable(processors))
  )
}
