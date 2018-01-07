package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html
 */

case class RecordColumn(
    mapping: Property[String] = Empty,
    sqlType: NonEmptyProperty[String],
    name: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Mapping" -> mapping,
    "SqlType" -> sqlType,
    "Name" -> name
  )
}
