package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html
 */

case class CopyCommand(
    copyOptions: Property[String] = Empty,
    dataTableColumns: Property[String] = Empty,
    dataTableName: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "CopyOptions" -> copyOptions,
    "DataTableColumns" -> dataTableColumns,
    "DataTableName" -> dataTableName
  )
}
