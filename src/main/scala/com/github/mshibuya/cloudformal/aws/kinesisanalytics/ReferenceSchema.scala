package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html
 */

case class ReferenceSchema(
    recordEncoding: Property[String] = Empty,
    recordColumns: NonEmptyProperty[Seq[RecordColumn]],
    recordFormat: NonEmptyProperty[RecordFormat]) extends Expression[ReferenceSchema] {
  def render: Formattable = Value(
    "RecordEncoding" -> recordEncoding,
    "RecordColumns" -> recordColumns,
    "RecordFormat" -> recordFormat
  )
}
