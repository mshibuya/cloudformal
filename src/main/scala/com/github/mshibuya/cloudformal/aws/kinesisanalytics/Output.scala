package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html
 */

case class Output(
    destinationSchema: DestinationSchema,
    kinesisFirehoseOutput: Option[KinesisFirehoseOutput] = None,
    kinesisStreamsOutput: Option[KinesisStreamsOutput] = None,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DestinationSchema" -> Some(Formattable(destinationSchema)),
    "KinesisFirehoseOutput" -> kinesisFirehoseOutput.map(Formattable(_)),
    "KinesisStreamsOutput" -> kinesisStreamsOutput.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
