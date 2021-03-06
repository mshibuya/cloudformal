package com.github.mshibuya.cloudformal.aws.dax

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html
 */

trait SubnetGroup extends Resource[SubnetGroup] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::DAX::SubnetGroup"

  def description: Property[String] = Empty
  def subnetGroupName: Property[String] = Empty
  def subnetIds: NonEmptyProperty[Seq[String]]

  def render(): MapValue[_] = Value(
    "Description" -> description,
    "SubnetGroupName" -> subnetGroupName,
    "SubnetIds" -> subnetIds
  )
}
