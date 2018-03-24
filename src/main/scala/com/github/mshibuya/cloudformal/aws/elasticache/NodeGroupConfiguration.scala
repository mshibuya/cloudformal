package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html
 */

case class NodeGroupConfiguration(
    primaryAvailabilityZone: Property[String] = Empty,
    replicaAvailabilityZones: Property[Seq[String]] = Empty,
    replicaCount: Property[Int] = Empty,
    slots: Property[String] = Empty) extends Expression[NodeGroupConfiguration] {
  def render: Formattable = Value(
    "PrimaryAvailabilityZone" -> primaryAvailabilityZone,
    "ReplicaAvailabilityZones" -> replicaAvailabilityZones,
    "ReplicaCount" -> replicaCount,
    "Slots" -> slots
  )
}
