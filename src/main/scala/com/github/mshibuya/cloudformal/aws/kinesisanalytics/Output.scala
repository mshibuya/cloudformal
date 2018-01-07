package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html
 */

case class Output(
    destinationSchema: NonEmptyProperty[DestinationSchema],
    kinesisFirehoseOutput: Property[KinesisFirehoseOutput] = Empty,
    kinesisStreamsOutput: Property[KinesisStreamsOutput] = Empty,
    name: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DestinationSchema" -> destinationSchema,
    "KinesisFirehoseOutput" -> kinesisFirehoseOutput,
    "KinesisStreamsOutput" -> kinesisStreamsOutput,
    "Name" -> name
  )
}
