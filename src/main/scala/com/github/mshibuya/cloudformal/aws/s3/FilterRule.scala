package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key-rules.html
 */

case class FilterRule(
    name: String,
    value: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Name" -> Some(Formattable(name)),
    "Value" -> Some(Formattable(value))
  )
}
