package com.github.mshibuya.cloudformal.aws.elasticsearch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html
 */

case class ElasticsearchClusterConfig(
    dedicatedMasterCount: Option[Int] = None,
    dedicatedMasterEnabled: Option[Boolean] = None,
    dedicatedMasterType: Option[String] = None,
    instanceCount: Option[Int] = None,
    instanceType: Option[String] = None,
    zoneAwarenessEnabled: Option[Boolean] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DedicatedMasterCount" -> dedicatedMasterCount.map(Formattable(_)),
    "DedicatedMasterEnabled" -> dedicatedMasterEnabled.map(Formattable(_)),
    "DedicatedMasterType" -> dedicatedMasterType.map(Formattable(_)),
    "InstanceCount" -> instanceCount.map(Formattable(_)),
    "InstanceType" -> instanceType.map(Formattable(_)),
    "ZoneAwarenessEnabled" -> zoneAwarenessEnabled.map(Formattable(_))
  )
}
