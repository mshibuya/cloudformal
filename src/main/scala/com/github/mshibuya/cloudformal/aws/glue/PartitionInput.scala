package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html
 */

case class PartitionInput(
    parameters: Property[Json] = Empty,
    storageDescriptor: Property[StorageDescriptor] = Empty,
    values: NonEmptyProperty[Seq[String]]) extends Expression[PartitionInput] {
  def render: Formattable = Value(
    "Parameters" -> parameters,
    "StorageDescriptor" -> storageDescriptor,
    "Values" -> values
  )
}
