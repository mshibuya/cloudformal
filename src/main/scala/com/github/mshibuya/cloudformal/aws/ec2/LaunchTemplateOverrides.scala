package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html
 */

case class LaunchTemplateOverrides(
    availabilityZone: Property[String] = Empty,
    instanceType: Property[String] = Empty,
    spotPrice: Property[String] = Empty,
    subnetId: Property[String] = Empty,
    weightedCapacity: Property[Double] = Empty) extends Expression[LaunchTemplateOverrides] {
  def render: Formattable = Value(
    "AvailabilityZone" -> availabilityZone,
    "InstanceType" -> instanceType,
    "SpotPrice" -> spotPrice,
    "SubnetId" -> subnetId,
    "WeightedCapacity" -> weightedCapacity
  )
}
