package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html
 */

trait TrunkInterfaceAssociation extends Resource {
  val resourceTypeName = "AWS::EC2::TrunkInterfaceAssociation"

  def branchInterfaceId: String
  def gREKey: Option[Int] = None
  def trunkInterfaceId: String
  def vLANId: Option[Int] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "BranchInterfaceId" -> Some(Formattable(branchInterfaceId)),
    "GREKey" -> gREKey.map(Formattable(_)),
    "TrunkInterfaceId" -> Some(Formattable(trunkInterfaceId)),
    "VLANId" -> vLANId.map(Formattable(_))
  )
}
