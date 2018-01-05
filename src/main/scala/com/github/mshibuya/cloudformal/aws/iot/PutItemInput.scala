package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html
 */

case class PutItemInput(
    tableName: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "TableName" -> Some(Formattable(tableName))
  )
}
