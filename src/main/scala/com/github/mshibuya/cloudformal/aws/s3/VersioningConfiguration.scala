package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html
 */

case class VersioningConfiguration(
    status: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Status" -> Some(Formattable(status))
  )
}
