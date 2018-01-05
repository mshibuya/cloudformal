package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html
 */

case class CopyCommand(
    copyOptions: Option[String] = None,
    dataTableColumns: Option[String] = None,
    dataTableName: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CopyOptions" -> copyOptions.map(Formattable(_)),
    "DataTableColumns" -> dataTableColumns.map(Formattable(_)),
    "DataTableName" -> Some(Formattable(dataTableName))
  )
}
