package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html
 */

case class Input(
    namePrefix: NonEmptyProperty[String],
    inputSchema: NonEmptyProperty[InputSchema],
    kinesisStreamsInput: Property[KinesisStreamsInput] = Empty,
    kinesisFirehoseInput: Property[KinesisFirehoseInput] = Empty,
    inputProcessingConfiguration: Property[InputProcessingConfiguration] = Empty,
    inputParallelism: Property[InputParallelism] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "NamePrefix" -> namePrefix,
    "InputSchema" -> inputSchema,
    "KinesisStreamsInput" -> kinesisStreamsInput,
    "KinesisFirehoseInput" -> kinesisFirehoseInput,
    "InputProcessingConfiguration" -> inputProcessingConfiguration,
    "InputParallelism" -> inputParallelism
  )
}
