package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html
 */

trait TrunkInterfaceAssociation extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::TrunkInterfaceAssociation"

  def branchInterfaceId: NonEmptyProperty[String]
  def greKey: Property[Int] = Empty
  def trunkInterfaceId: NonEmptyProperty[String]
  def vlanId: Property[Int] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "BranchInterfaceId" -> branchInterfaceId,
    "GREKey" -> greKey,
    "TrunkInterfaceId" -> trunkInterfaceId,
    "VLANId" -> vlanId
  )
}
