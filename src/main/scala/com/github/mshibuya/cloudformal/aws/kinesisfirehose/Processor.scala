package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html
 */

case class Processor(
    parameters: NonEmptyProperty[Seq[ProcessorParameter]],
    `type`: NonEmptyProperty[String]) extends Expression[Processor] {
  def render: Formattable = Value(
    "Parameters" -> parameters,
    "Type" -> `type`
  )
}
