package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html
 */

case class SpotFleetRequestConfigData(
    allocationStrategy: Option[String] = None,
    excessCapacityTerminationPolicy: Option[String] = None,
    iamFleetRole: String,
    launchSpecifications: Seq[SpotFleetLaunchSpecification],
    replaceUnhealthyInstances: Option[Boolean] = None,
    spotPrice: Option[String] = None,
    targetCapacity: Int,
    terminateInstancesWithExpiration: Option[Boolean] = None,
    `type`: Option[String] = None,
    validFrom: Option[String] = None,
    validUntil: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AllocationStrategy" -> allocationStrategy.map(Formattable(_)),
    "ExcessCapacityTerminationPolicy" -> excessCapacityTerminationPolicy.map(Formattable(_)),
    "IamFleetRole" -> Some(Formattable(iamFleetRole)),
    "LaunchSpecifications" -> Some(Formattable(launchSpecifications)),
    "ReplaceUnhealthyInstances" -> replaceUnhealthyInstances.map(Formattable(_)),
    "SpotPrice" -> spotPrice.map(Formattable(_)),
    "TargetCapacity" -> Some(Formattable(targetCapacity)),
    "TerminateInstancesWithExpiration" -> terminateInstancesWithExpiration.map(Formattable(_)),
    "Type" -> `type`.map(Formattable(_)),
    "ValidFrom" -> validFrom.map(Formattable(_)),
    "ValidUntil" -> validUntil.map(Formattable(_))
  )
}
