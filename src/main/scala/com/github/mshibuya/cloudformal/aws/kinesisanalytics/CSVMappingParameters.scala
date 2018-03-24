package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html
 */

case class CSVMappingParameters(
    recordRowDelimiter: NonEmptyProperty[String],
    recordColumnDelimiter: NonEmptyProperty[String]) extends Expression[CSVMappingParameters] {
  def render: Formattable = Value(
    "RecordRowDelimiter" -> recordRowDelimiter,
    "RecordColumnDelimiter" -> recordColumnDelimiter
  )
}
