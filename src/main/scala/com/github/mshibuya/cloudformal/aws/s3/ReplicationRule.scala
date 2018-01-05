package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html
 */

case class ReplicationRule(
    destination: ReplicationDestination,
    id: Option[String] = None,
    prefix: String,
    status: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Destination" -> Some(Formattable(destination)),
    "Id" -> id.map(Formattable(_)),
    "Prefix" -> Some(Formattable(prefix)),
    "Status" -> Some(Formattable(status))
  )
}
