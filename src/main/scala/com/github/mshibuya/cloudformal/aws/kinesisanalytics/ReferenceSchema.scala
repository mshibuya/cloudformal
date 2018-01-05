package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html
 */

case class ReferenceSchema(
    recordEncoding: Option[String] = None,
    recordColumns: Seq[RecordColumn],
    recordFormat: RecordFormat) extends Renderable {
  def render: Formattable = Formattable.opt(
    "RecordEncoding" -> recordEncoding.map(Formattable(_)),
    "RecordColumns" -> Some(Formattable(recordColumns)),
    "RecordFormat" -> Some(Formattable(recordFormat))
  )
}
