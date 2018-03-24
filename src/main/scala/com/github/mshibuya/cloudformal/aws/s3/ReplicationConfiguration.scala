package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html
 */

case class ReplicationConfiguration(
    role: NonEmptyProperty[String],
    rules: NonEmptyProperty[Seq[ReplicationRule]]) extends Expression[ReplicationConfiguration] {
  def render: Formattable = Value(
    "Role" -> role,
    "Rules" -> rules
  )
}
