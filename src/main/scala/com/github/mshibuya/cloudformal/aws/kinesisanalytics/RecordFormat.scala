package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html
 */

case class RecordFormat(
    mappingParameters: Option[MappingParameters] = None,
    recordFormatType: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MappingParameters" -> mappingParameters.map(Formattable(_)),
    "RecordFormatType" -> Some(Formattable(recordFormatType))
  )
}
