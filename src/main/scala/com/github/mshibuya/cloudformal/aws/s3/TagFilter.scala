package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html
 */

case class TagFilter(
    key: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Expression[TagFilter] {
  def render: Formattable = Value(
    "Key" -> key,
    "Value" -> value
  )
}
