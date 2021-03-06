package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html
 */

trait InstanceFleetConfig extends Resource[InstanceFleetConfig] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EMR::InstanceFleetConfig"

  def clusterId: NonEmptyProperty[String]
  def instanceFleetType: NonEmptyProperty[String]
  def instanceTypeConfigs: Property[Seq[InstanceTypeConfig]] = Empty
  def launchSpecifications: Property[InstanceFleetProvisioningSpecifications] = Empty
  def name: Property[String] = Empty
  def targetOnDemandCapacity: Property[Int] = Empty
  def targetSpotCapacity: Property[Int] = Empty

  def render(): MapValue[_] = Value(
    "ClusterId" -> clusterId,
    "InstanceFleetType" -> instanceFleetType,
    "InstanceTypeConfigs" -> instanceTypeConfigs,
    "LaunchSpecifications" -> launchSpecifications,
    "Name" -> name,
    "TargetOnDemandCapacity" -> targetOnDemandCapacity,
    "TargetSpotCapacity" -> targetSpotCapacity
  )
}
