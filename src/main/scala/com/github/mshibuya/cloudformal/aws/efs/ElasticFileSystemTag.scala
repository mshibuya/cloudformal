package com.github.mshibuya.cloudformal.aws.efs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemtags.html
 */

case class ElasticFileSystemTag(
    key: String,
    value: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Key" -> Some(Formattable(key)),
    "Value" -> Some(Formattable(value))
  )
}
