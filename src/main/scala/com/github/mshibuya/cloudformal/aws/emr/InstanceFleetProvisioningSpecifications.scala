package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetprovisioningspecifications.html
 */

case class InstanceFleetProvisioningSpecifications(
    spotSpecification: NonEmptyProperty[SpotProvisioningSpecification]) extends Expression[InstanceFleetProvisioningSpecifications] {
  def render: Formattable = Value(
    "SpotSpecification" -> spotSpecification
  )
}
