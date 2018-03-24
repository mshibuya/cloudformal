package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html
 */

case class S3KeyFilter(
    rules: NonEmptyProperty[Seq[FilterRule]]) extends Expression[S3KeyFilter] {
  def render: Formattable = Value(
    "Rules" -> rules
  )
}
