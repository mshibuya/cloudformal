package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html
 */

case class RecordColumn(
    mapping: Option[String] = None,
    sqlType: String,
    name: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Mapping" -> mapping.map(Formattable(_)),
    "SqlType" -> Some(Formattable(sqlType)),
    "Name" -> Some(Formattable(name))
  )
}
