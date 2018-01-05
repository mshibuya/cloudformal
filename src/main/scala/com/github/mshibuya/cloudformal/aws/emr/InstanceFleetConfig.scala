package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html
 */

trait InstanceFleetConfig extends Resource {
  val resourceTypeName = "AWS::EMR::InstanceFleetConfig"

  def clusterId: String
  def instanceFleetType: String
  def instanceTypeConfigs: Option[Seq[InstanceTypeConfig]] = None
  def launchSpecifications: Option[InstanceFleetProvisioningSpecifications] = None
  def name: Option[String] = None
  def targetOnDemandCapacity: Option[Int] = None
  def targetSpotCapacity: Option[Int] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ClusterId" -> Some(Formattable(clusterId)),
    "InstanceFleetType" -> Some(Formattable(instanceFleetType)),
    "InstanceTypeConfigs" -> instanceTypeConfigs.map(Formattable(_)),
    "LaunchSpecifications" -> launchSpecifications.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "TargetOnDemandCapacity" -> targetOnDemandCapacity.map(Formattable(_)),
    "TargetSpotCapacity" -> targetSpotCapacity.map(Formattable(_))
  )
}
