package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html
 */

case class JobFlowInstancesConfig(
    additionalMasterSecurityGroups: Property[Seq[String]] = Empty,
    additionalSlaveSecurityGroups: Property[Seq[String]] = Empty,
    coreInstanceFleet: Property[InstanceFleetConfig] = Empty,
    coreInstanceGroup: Property[InstanceGroupConfig] = Empty,
    ec2KeyName: Property[String] = Empty,
    ec2SubnetId: Property[String] = Empty,
    emrManagedMasterSecurityGroup: Property[String] = Empty,
    emrManagedSlaveSecurityGroup: Property[String] = Empty,
    hadoopVersion: Property[String] = Empty,
    masterInstanceFleet: Property[InstanceFleetConfig] = Empty,
    masterInstanceGroup: Property[InstanceGroupConfig] = Empty,
    placement: Property[PlacementType] = Empty,
    serviceAccessSecurityGroup: Property[String] = Empty,
    terminationProtected: Property[Boolean] = Empty) extends Expression[JobFlowInstancesConfig] {
  def render: Formattable = Value(
    "AdditionalMasterSecurityGroups" -> additionalMasterSecurityGroups,
    "AdditionalSlaveSecurityGroups" -> additionalSlaveSecurityGroups,
    "CoreInstanceFleet" -> coreInstanceFleet,
    "CoreInstanceGroup" -> coreInstanceGroup,
    "Ec2KeyName" -> ec2KeyName,
    "Ec2SubnetId" -> ec2SubnetId,
    "EmrManagedMasterSecurityGroup" -> emrManagedMasterSecurityGroup,
    "EmrManagedSlaveSecurityGroup" -> emrManagedSlaveSecurityGroup,
    "HadoopVersion" -> hadoopVersion,
    "MasterInstanceFleet" -> masterInstanceFleet,
    "MasterInstanceGroup" -> masterInstanceGroup,
    "Placement" -> placement,
    "ServiceAccessSecurityGroup" -> serviceAccessSecurityGroup,
    "TerminationProtected" -> terminationProtected
  )
}
