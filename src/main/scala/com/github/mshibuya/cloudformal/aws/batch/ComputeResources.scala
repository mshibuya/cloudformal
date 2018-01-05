package com.github.mshibuya.cloudformal.aws.batch

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html
 */

case class ComputeResources(
    spotIamFleetRole: Option[String] = None,
    maxvCpus: Int,
    bidPercentage: Option[Int] = None,
    securityGroupIds: Seq[String],
    subnets: Seq[String],
    `type`: String,
    minvCpus: Int,
    imageId: Option[String] = None,
    instanceRole: String,
    instanceTypes: Seq[String],
    ec2KeyPair: Option[String] = None,
    tags: Option[Json] = None,
    desiredvCpus: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "SpotIamFleetRole" -> spotIamFleetRole.map(Formattable(_)),
    "MaxvCpus" -> Some(Formattable(maxvCpus)),
    "BidPercentage" -> bidPercentage.map(Formattable(_)),
    "SecurityGroupIds" -> Some(Formattable(securityGroupIds)),
    "Subnets" -> Some(Formattable(subnets)),
    "Type" -> Some(Formattable(`type`)),
    "MinvCpus" -> Some(Formattable(minvCpus)),
    "ImageId" -> imageId.map(Formattable(_)),
    "InstanceRole" -> Some(Formattable(instanceRole)),
    "InstanceTypes" -> Some(Formattable(instanceTypes)),
    "Ec2KeyPair" -> ec2KeyPair.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "DesiredvCpus" -> desiredvCpus.map(Formattable(_))
  )
}
