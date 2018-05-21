package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html
 */

case class LaunchTemplateData(
    securityGroups: Property[Seq[String]] = Empty,
    tagSpecifications: Property[Seq[TagSpecification]] = Empty,
    userData: Property[String] = Empty,
    instanceInitiatedShutdownBehavior: Property[String] = Empty,
    blockDeviceMappings: Property[Seq[BlockDeviceMapping]] = Empty,
    iamInstanceProfile: Property[IamInstanceProfile] = Empty,
    kernelId: Property[String] = Empty,
    securityGroupIds: Property[Seq[String]] = Empty,
    ebsOptimized: Property[Boolean] = Empty,
    keyName: Property[String] = Empty,
    disableApiTermination: Property[Boolean] = Empty,
    elasticGpuSpecifications: Property[Seq[ElasticGpuSpecification]] = Empty,
    placement: Property[Placement] = Empty,
    instanceMarketOptions: Property[InstanceMarketOptions] = Empty,
    networkInterfaces: Property[Seq[NetworkInterface]] = Empty,
    imageId: Property[String] = Empty,
    instanceType: Property[String] = Empty,
    ramDiskId: Property[String] = Empty,
    monitoring: Property[Monitoring] = Empty,
    creditSpecification: Property[CreditSpecification] = Empty) extends Expression[LaunchTemplateData] {
  def render: Formattable = Value(
    "SecurityGroups" -> securityGroups,
    "TagSpecifications" -> tagSpecifications,
    "UserData" -> userData,
    "InstanceInitiatedShutdownBehavior" -> instanceInitiatedShutdownBehavior,
    "BlockDeviceMappings" -> blockDeviceMappings,
    "IamInstanceProfile" -> iamInstanceProfile,
    "KernelId" -> kernelId,
    "SecurityGroupIds" -> securityGroupIds,
    "EbsOptimized" -> ebsOptimized,
    "KeyName" -> keyName,
    "DisableApiTermination" -> disableApiTermination,
    "ElasticGpuSpecifications" -> elasticGpuSpecifications,
    "Placement" -> placement,
    "InstanceMarketOptions" -> instanceMarketOptions,
    "NetworkInterfaces" -> networkInterfaces,
    "ImageId" -> imageId,
    "InstanceType" -> instanceType,
    "RamDiskId" -> ramDiskId,
    "Monitoring" -> monitoring,
    "CreditSpecification" -> creditSpecification
  )
}
