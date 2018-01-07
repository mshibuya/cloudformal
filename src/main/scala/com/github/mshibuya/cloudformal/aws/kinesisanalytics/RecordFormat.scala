package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html
 */

case class RecordFormat(
    mappingParameters: Property[MappingParameters] = Empty,
    recordFormatType: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "MappingParameters" -> mappingParameters,
    "RecordFormatType" -> recordFormatType
  )
}
