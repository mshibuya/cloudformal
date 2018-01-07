package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
 */

case class ProcessingConfiguration(
    enabled: NonEmptyProperty[Boolean],
    processors: NonEmptyProperty[Seq[Processor]]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Enabled" -> enabled,
    "Processors" -> processors
  )
}
