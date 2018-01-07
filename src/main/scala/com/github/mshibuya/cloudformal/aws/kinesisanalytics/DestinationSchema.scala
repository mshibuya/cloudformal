package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html
 */

case class DestinationSchema(
    recordFormatType: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "RecordFormatType" -> recordFormatType
  )
}
