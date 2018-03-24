package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
 */

case class ProcessingConfiguration(
    enabled: NonEmptyProperty[Boolean],
    processors: NonEmptyProperty[Seq[Processor]]) extends Expression[ProcessingConfiguration] {
  def render: Formattable = Value(
    "Enabled" -> enabled,
    "Processors" -> processors
  )
}
