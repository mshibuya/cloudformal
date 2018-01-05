package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html
 */

case class SpotFleetLaunchSpecification(
    blockDeviceMappings: Option[Seq[BlockDeviceMapping]] = None,
    ebsOptimized: Option[Boolean] = None,
    iamInstanceProfile: Option[IamInstanceProfileSpecification] = None,
    imageId: String,
    instanceType: String,
    kernelId: Option[String] = None,
    keyName: Option[String] = None,
    monitoring: Option[SpotFleetMonitoring] = None,
    networkInterfaces: Option[Seq[InstanceNetworkInterfaceSpecification]] = None,
    placement: Option[SpotPlacement] = None,
    ramdiskId: Option[String] = None,
    securityGroups: Option[Seq[GroupIdentifier]] = None,
    spotPrice: Option[String] = None,
    subnetId: Option[String] = None,
    userData: Option[String] = None,
    weightedCapacity: Option[Double] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "BlockDeviceMappings" -> blockDeviceMappings.map(Formattable(_)),
    "EbsOptimized" -> ebsOptimized.map(Formattable(_)),
    "IamInstanceProfile" -> iamInstanceProfile.map(Formattable(_)),
    "ImageId" -> Some(Formattable(imageId)),
    "InstanceType" -> Some(Formattable(instanceType)),
    "KernelId" -> kernelId.map(Formattable(_)),
    "KeyName" -> keyName.map(Formattable(_)),
    "Monitoring" -> monitoring.map(Formattable(_)),
    "NetworkInterfaces" -> networkInterfaces.map(Formattable(_)),
    "Placement" -> placement.map(Formattable(_)),
    "RamdiskId" -> ramdiskId.map(Formattable(_)),
    "SecurityGroups" -> securityGroups.map(Formattable(_)),
    "SpotPrice" -> spotPrice.map(Formattable(_)),
    "SubnetId" -> subnetId.map(Formattable(_)),
    "UserData" -> userData.map(Formattable(_)),
    "WeightedCapacity" -> weightedCapacity.map(Formattable(_))
  )
}
