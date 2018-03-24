package com.github.mshibuya.cloudformal.aws.efs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemtags.html
 */

case class ElasticFileSystemTag(
    key: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Expression[ElasticFileSystemTag] {
  def render: Formattable = Value(
    "Key" -> key,
    "Value" -> value
  )
}
