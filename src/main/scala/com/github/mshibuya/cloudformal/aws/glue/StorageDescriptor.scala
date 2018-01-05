package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html
 */

case class StorageDescriptor(
    storedAsSubDirectories: Option[Boolean] = None,
    parameters: Option[Json] = None,
    bucketColumns: Option[Seq[String]] = None,
    skewedInfo: Option[SkewedInfo] = None,
    inputFormat: Option[String] = None,
    numberOfBuckets: Option[Int] = None,
    outputFormat: Option[String] = None,
    columns: Option[Seq[Column]] = None,
    serdeInfo: Option[SerdeInfo] = None,
    sortColumns: Option[Seq[Order]] = None,
    compressed: Option[Boolean] = None,
    location: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "StoredAsSubDirectories" -> storedAsSubDirectories.map(Formattable(_)),
    "Parameters" -> parameters.map(Formattable(_)),
    "BucketColumns" -> bucketColumns.map(Formattable(_)),
    "SkewedInfo" -> skewedInfo.map(Formattable(_)),
    "InputFormat" -> inputFormat.map(Formattable(_)),
    "NumberOfBuckets" -> numberOfBuckets.map(Formattable(_)),
    "OutputFormat" -> outputFormat.map(Formattable(_)),
    "Columns" -> columns.map(Formattable(_)),
    "SerdeInfo" -> serdeInfo.map(Formattable(_)),
    "SortColumns" -> sortColumns.map(Formattable(_)),
    "Compressed" -> compressed.map(Formattable(_)),
    "Location" -> location.map(Formattable(_))
  )
}
