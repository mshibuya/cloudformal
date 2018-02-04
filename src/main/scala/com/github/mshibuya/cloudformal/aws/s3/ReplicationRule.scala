package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html
 */

case class ReplicationRule(
    destination: NonEmptyProperty[ReplicationDestination],
    id: Property[String] = Empty,
    prefix: NonEmptyProperty[String],
    sourceSelectionCriteria: Property[SourceSelectionCriteria] = Empty,
    status: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Destination" -> destination,
    "Id" -> id,
    "Prefix" -> prefix,
    "SourceSelectionCriteria" -> sourceSelectionCriteria,
    "Status" -> status
  )
}
