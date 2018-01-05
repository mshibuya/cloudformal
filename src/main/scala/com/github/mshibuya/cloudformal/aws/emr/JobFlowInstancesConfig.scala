package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html
 */

case class JobFlowInstancesConfig(
    additionalMasterSecurityGroups: Option[Seq[String]] = None,
    additionalSlaveSecurityGroups: Option[Seq[String]] = None,
    coreInstanceFleet: Option[InstanceFleetConfig] = None,
    coreInstanceGroup: Option[InstanceGroupConfig] = None,
    ec2KeyName: Option[String] = None,
    ec2SubnetId: Option[String] = None,
    emrManagedMasterSecurityGroup: Option[String] = None,
    emrManagedSlaveSecurityGroup: Option[String] = None,
    hadoopVersion: Option[String] = None,
    masterInstanceFleet: Option[InstanceFleetConfig] = None,
    masterInstanceGroup: Option[InstanceGroupConfig] = None,
    placement: Option[PlacementType] = None,
    serviceAccessSecurityGroup: Option[String] = None,
    terminationProtected: Option[Boolean] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AdditionalMasterSecurityGroups" -> additionalMasterSecurityGroups.map(Formattable(_)),
    "AdditionalSlaveSecurityGroups" -> additionalSlaveSecurityGroups.map(Formattable(_)),
    "CoreInstanceFleet" -> coreInstanceFleet.map(Formattable(_)),
    "CoreInstanceGroup" -> coreInstanceGroup.map(Formattable(_)),
    "Ec2KeyName" -> ec2KeyName.map(Formattable(_)),
    "Ec2SubnetId" -> ec2SubnetId.map(Formattable(_)),
    "EmrManagedMasterSecurityGroup" -> emrManagedMasterSecurityGroup.map(Formattable(_)),
    "EmrManagedSlaveSecurityGroup" -> emrManagedSlaveSecurityGroup.map(Formattable(_)),
    "HadoopVersion" -> hadoopVersion.map(Formattable(_)),
    "MasterInstanceFleet" -> masterInstanceFleet.map(Formattable(_)),
    "MasterInstanceGroup" -> masterInstanceGroup.map(Formattable(_)),
    "Placement" -> placement.map(Formattable(_)),
    "ServiceAccessSecurityGroup" -> serviceAccessSecurityGroup.map(Formattable(_)),
    "TerminationProtected" -> terminationProtected.map(Formattable(_))
  )
}
