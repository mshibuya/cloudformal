package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html
 */

case class TableInput(
    owner: Option[String] = None,
    viewOriginalText: Option[String] = None,
    description: Option[String] = None,
    tableType: Option[String] = None,
    parameters: Option[Json] = None,
    viewExpandedText: Option[String] = None,
    storageDescriptor: Option[StorageDescriptor] = None,
    partitionKeys: Option[Seq[Column]] = None,
    retention: Option[Int] = None,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Owner" -> owner.map(Formattable(_)),
    "ViewOriginalText" -> viewOriginalText.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "TableType" -> tableType.map(Formattable(_)),
    "Parameters" -> parameters.map(Formattable(_)),
    "ViewExpandedText" -> viewExpandedText.map(Formattable(_)),
    "StorageDescriptor" -> storageDescriptor.map(Formattable(_)),
    "PartitionKeys" -> partitionKeys.map(Formattable(_)),
    "Retention" -> retention.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
