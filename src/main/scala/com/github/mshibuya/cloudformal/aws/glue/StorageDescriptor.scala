package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html
 */

case class StorageDescriptor(
    storedAsSubDirectories: Property[Boolean] = Empty,
    parameters: Property[Json] = Empty,
    bucketColumns: Property[Seq[String]] = Empty,
    skewedInfo: Property[SkewedInfo] = Empty,
    inputFormat: Property[String] = Empty,
    numberOfBuckets: Property[Int] = Empty,
    outputFormat: Property[String] = Empty,
    columns: Property[Seq[Column]] = Empty,
    serdeInfo: Property[SerdeInfo] = Empty,
    sortColumns: Property[Seq[Order]] = Empty,
    compressed: Property[Boolean] = Empty,
    location: Property[String] = Empty) extends Expression[StorageDescriptor] {
  def render: Formattable = Value(
    "StoredAsSubDirectories" -> storedAsSubDirectories,
    "Parameters" -> parameters,
    "BucketColumns" -> bucketColumns,
    "SkewedInfo" -> skewedInfo,
    "InputFormat" -> inputFormat,
    "NumberOfBuckets" -> numberOfBuckets,
    "OutputFormat" -> outputFormat,
    "Columns" -> columns,
    "SerdeInfo" -> serdeInfo,
    "SortColumns" -> sortColumns,
    "Compressed" -> compressed,
    "Location" -> location
  )
}
