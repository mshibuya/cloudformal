package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html
 */

case class RecordFormat(
    mappingParameters: Property[MappingParameters] = Empty,
    recordFormatType: NonEmptyProperty[String]) extends Expression[RecordFormat] {
  def render: Formattable = Value(
    "MappingParameters" -> mappingParameters,
    "RecordFormatType" -> recordFormatType
  )
}
