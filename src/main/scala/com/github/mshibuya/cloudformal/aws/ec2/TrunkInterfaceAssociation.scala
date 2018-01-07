package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html
 */

trait TrunkInterfaceAssociation extends Resource {
  val resourceTypeName = "AWS::EC2::TrunkInterfaceAssociation"

  def branchInterfaceId: NonEmptyProperty[String]
  def gREKey: Property[Int] = Empty
  def trunkInterfaceId: NonEmptyProperty[String]
  def vLANId: Property[Int] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "BranchInterfaceId" -> branchInterfaceId,
    "GREKey" -> gREKey,
    "TrunkInterfaceId" -> trunkInterfaceId,
    "VLANId" -> vLANId
  )
}
