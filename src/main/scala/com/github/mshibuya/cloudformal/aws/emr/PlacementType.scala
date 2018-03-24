package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html
 */

case class PlacementType(
    availabilityZone: NonEmptyProperty[String]) extends Expression[PlacementType] {
  def render: Formattable = Value(
    "AvailabilityZone" -> availabilityZone
  )
}
