package com.github.mshibuya.cloudformal.aws.batch

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html
 */

case class ComputeResources(
    spotIamFleetRole: Property[String] = Empty,
    maxvCpus: NonEmptyProperty[Int],
    bidPercentage: Property[Int] = Empty,
    securityGroupIds: NonEmptyProperty[Seq[String]],
    subnets: NonEmptyProperty[Seq[String]],
    `type`: NonEmptyProperty[String],
    minvCpus: NonEmptyProperty[Int],
    imageId: Property[String] = Empty,
    instanceRole: NonEmptyProperty[String],
    instanceTypes: NonEmptyProperty[Seq[String]],
    ec2KeyPair: Property[String] = Empty,
    tags: Property[Json] = Empty,
    desiredvCpus: Property[Int] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "SpotIamFleetRole" -> spotIamFleetRole,
    "MaxvCpus" -> maxvCpus,
    "BidPercentage" -> bidPercentage,
    "SecurityGroupIds" -> securityGroupIds,
    "Subnets" -> subnets,
    "Type" -> `type`,
    "MinvCpus" -> minvCpus,
    "ImageId" -> imageId,
    "InstanceRole" -> instanceRole,
    "InstanceTypes" -> instanceTypes,
    "Ec2KeyPair" -> ec2KeyPair,
    "Tags" -> tags,
    "DesiredvCpus" -> desiredvCpus
  )
}
