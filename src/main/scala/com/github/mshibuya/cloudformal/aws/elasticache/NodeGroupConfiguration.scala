package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html
 */

case class NodeGroupConfiguration(
    primaryAvailabilityZone: Option[String] = None,
    replicaAvailabilityZones: Option[Seq[String]] = None,
    replicaCount: Option[Int] = None,
    slots: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "PrimaryAvailabilityZone" -> primaryAvailabilityZone.map(Formattable(_)),
    "ReplicaAvailabilityZones" -> replicaAvailabilityZones.map(Formattable(_)),
    "ReplicaCount" -> replicaCount.map(Formattable(_)),
    "Slots" -> slots.map(Formattable(_))
  )
}
