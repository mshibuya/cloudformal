package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html
 */

case class MappingParameters(
    jsonMappingParameters: Property[JSONMappingParameters] = Empty,
    csvMappingParameters: Property[CSVMappingParameters] = Empty) extends Expression[MappingParameters] {
  def render: Formattable = Value(
    "JSONMappingParameters" -> jsonMappingParameters,
    "CSVMappingParameters" -> csvMappingParameters
  )
}
