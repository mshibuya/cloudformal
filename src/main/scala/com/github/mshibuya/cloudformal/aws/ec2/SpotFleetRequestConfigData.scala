package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html
 */

case class SpotFleetRequestConfigData(
    allocationStrategy: Property[String] = Empty,
    excessCapacityTerminationPolicy: Property[String] = Empty,
    iamFleetRole: NonEmptyProperty[String],
    launchSpecifications: NonEmptyProperty[Seq[SpotFleetLaunchSpecification]],
    replaceUnhealthyInstances: Property[Boolean] = Empty,
    spotPrice: Property[String] = Empty,
    targetCapacity: NonEmptyProperty[Int],
    terminateInstancesWithExpiration: Property[Boolean] = Empty,
    `type`: Property[String] = Empty,
    validFrom: Property[String] = Empty,
    validUntil: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AllocationStrategy" -> allocationStrategy,
    "ExcessCapacityTerminationPolicy" -> excessCapacityTerminationPolicy,
    "IamFleetRole" -> iamFleetRole,
    "LaunchSpecifications" -> launchSpecifications,
    "ReplaceUnhealthyInstances" -> replaceUnhealthyInstances,
    "SpotPrice" -> spotPrice,
    "TargetCapacity" -> targetCapacity,
    "TerminateInstancesWithExpiration" -> terminateInstancesWithExpiration,
    "Type" -> `type`,
    "ValidFrom" -> validFrom,
    "ValidUntil" -> validUntil
  )
}
