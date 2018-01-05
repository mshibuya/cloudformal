package com.github.mshibuya.cloudformal.aws.glue

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html
 */

case class PartitionInput(
    parameters: Option[Json] = None,
    storageDescriptor: Option[StorageDescriptor] = None,
    values: Seq[String]) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Parameters" -> parameters.map(Formattable(_)),
    "StorageDescriptor" -> storageDescriptor.map(Formattable(_)),
    "Values" -> Some(Formattable(values))
  )
}
