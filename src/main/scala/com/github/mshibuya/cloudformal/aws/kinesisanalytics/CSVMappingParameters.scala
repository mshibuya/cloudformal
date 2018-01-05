package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html
 */

case class CSVMappingParameters(
    recordRowDelimiter: String,
    recordColumnDelimiter: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "RecordRowDelimiter" -> Some(Formattable(recordRowDelimiter)),
    "RecordColumnDelimiter" -> Some(Formattable(recordColumnDelimiter))
  )
}
