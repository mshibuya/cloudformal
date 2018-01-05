package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html
 */

case class Input(
    namePrefix: String,
    inputSchema: InputSchema,
    kinesisStreamsInput: Option[KinesisStreamsInput] = None,
    kinesisFirehoseInput: Option[KinesisFirehoseInput] = None,
    inputProcessingConfiguration: Option[InputProcessingConfiguration] = None,
    inputParallelism: Option[InputParallelism] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "NamePrefix" -> Some(Formattable(namePrefix)),
    "InputSchema" -> Some(Formattable(inputSchema)),
    "KinesisStreamsInput" -> kinesisStreamsInput.map(Formattable(_)),
    "KinesisFirehoseInput" -> kinesisFirehoseInput.map(Formattable(_)),
    "InputProcessingConfiguration" -> inputProcessingConfiguration.map(Formattable(_)),
    "InputParallelism" -> inputParallelism.map(Formattable(_))
  )
}
