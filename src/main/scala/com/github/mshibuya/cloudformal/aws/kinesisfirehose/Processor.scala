package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html
 */

case class Processor(
    parameters: Seq[ProcessorParameter],
    `type`: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Parameters" -> Some(Formattable(parameters)),
    "Type" -> Some(Formattable(`type`))
  )
}
