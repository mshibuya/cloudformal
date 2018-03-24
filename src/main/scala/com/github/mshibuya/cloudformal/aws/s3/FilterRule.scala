package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key-rules.html
 */

case class FilterRule(
    name: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Expression[FilterRule] {
  def render: Formattable = Value(
    "Name" -> name,
    "Value" -> value
  )
}
