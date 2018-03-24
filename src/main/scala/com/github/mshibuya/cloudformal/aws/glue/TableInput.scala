package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html
 */

case class TableInput(
    owner: Property[String] = Empty,
    viewOriginalText: Property[String] = Empty,
    description: Property[String] = Empty,
    tableType: Property[String] = Empty,
    parameters: Property[Json] = Empty,
    viewExpandedText: Property[String] = Empty,
    storageDescriptor: Property[StorageDescriptor] = Empty,
    partitionKeys: Property[Seq[Column]] = Empty,
    retention: Property[Int] = Empty,
    name: Property[String] = Empty) extends Expression[TableInput] {
  def render: Formattable = Value(
    "Owner" -> owner,
    "ViewOriginalText" -> viewOriginalText,
    "Description" -> description,
    "TableType" -> tableType,
    "Parameters" -> parameters,
    "ViewExpandedText" -> viewExpandedText,
    "StorageDescriptor" -> storageDescriptor,
    "PartitionKeys" -> partitionKeys,
    "Retention" -> retention,
    "Name" -> name
  )
}
