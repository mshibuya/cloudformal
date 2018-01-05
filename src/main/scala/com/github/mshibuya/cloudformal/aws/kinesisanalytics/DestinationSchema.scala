package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html
 */

case class DestinationSchema(
    recordFormatType: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "RecordFormatType" -> recordFormatType.map(Formattable(_))
  )
}
