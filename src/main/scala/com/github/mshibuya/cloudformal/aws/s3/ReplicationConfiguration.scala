package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html
 */

case class ReplicationConfiguration(
    role: String,
    rules: Seq[ReplicationRule]) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Role" -> Some(Formattable(role)),
    "Rules" -> Some(Formattable(rules))
  )
}
