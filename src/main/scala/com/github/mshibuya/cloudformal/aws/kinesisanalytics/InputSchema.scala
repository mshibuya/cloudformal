package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html
 */

case class InputSchema(
    recordEncoding: Property[String] = Empty,
    recordColumns: NonEmptyProperty[Seq[RecordColumn]],
    recordFormat: NonEmptyProperty[RecordFormat]) extends Expression[InputSchema] {
  def render: Formattable = Value(
    "RecordEncoding" -> recordEncoding,
    "RecordColumns" -> recordColumns,
    "RecordFormat" -> recordFormat
  )
}
