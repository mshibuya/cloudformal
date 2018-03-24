package com.github.mshibuya.cloudformal.aws.elasticsearch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html
 */

case class ElasticsearchClusterConfig(
    dedicatedMasterCount: Property[Int] = Empty,
    dedicatedMasterEnabled: Property[Boolean] = Empty,
    dedicatedMasterType: Property[String] = Empty,
    instanceCount: Property[Int] = Empty,
    instanceType: Property[String] = Empty,
    zoneAwarenessEnabled: Property[Boolean] = Empty) extends Expression[ElasticsearchClusterConfig] {
  def render: Formattable = Value(
    "DedicatedMasterCount" -> dedicatedMasterCount,
    "DedicatedMasterEnabled" -> dedicatedMasterEnabled,
    "DedicatedMasterType" -> dedicatedMasterType,
    "InstanceCount" -> instanceCount,
    "InstanceType" -> instanceType,
    "ZoneAwarenessEnabled" -> zoneAwarenessEnabled
  )
}
