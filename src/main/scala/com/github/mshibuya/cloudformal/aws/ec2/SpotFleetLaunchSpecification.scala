package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html
 */

case class SpotFleetLaunchSpecification(
    blockDeviceMappings: Property[Seq[BlockDeviceMapping]] = Empty,
    ebsOptimized: Property[Boolean] = Empty,
    iamInstanceProfile: Property[IamInstanceProfileSpecification] = Empty,
    imageId: NonEmptyProperty[String],
    instanceType: NonEmptyProperty[String],
    kernelId: Property[String] = Empty,
    keyName: Property[String] = Empty,
    monitoring: Property[SpotFleetMonitoring] = Empty,
    networkInterfaces: Property[Seq[InstanceNetworkInterfaceSpecification]] = Empty,
    placement: Property[SpotPlacement] = Empty,
    ramdiskId: Property[String] = Empty,
    securityGroups: Property[Seq[GroupIdentifier]] = Empty,
    spotPrice: Property[String] = Empty,
    subnetId: Property[String] = Empty,
    tagSpecifications: Property[Seq[SpotFleetTagSpecification]] = Empty,
    userData: Property[String] = Empty,
    weightedCapacity: Property[Double] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "BlockDeviceMappings" -> blockDeviceMappings,
    "EbsOptimized" -> ebsOptimized,
    "IamInstanceProfile" -> iamInstanceProfile,
    "ImageId" -> imageId,
    "InstanceType" -> instanceType,
    "KernelId" -> kernelId,
    "KeyName" -> keyName,
    "Monitoring" -> monitoring,
    "NetworkInterfaces" -> networkInterfaces,
    "Placement" -> placement,
    "RamdiskId" -> ramdiskId,
    "SecurityGroups" -> securityGroups,
    "SpotPrice" -> spotPrice,
    "SubnetId" -> subnetId,
    "TagSpecifications" -> tagSpecifications,
    "UserData" -> userData,
    "WeightedCapacity" -> weightedCapacity
  )
}
