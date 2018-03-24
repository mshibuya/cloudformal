package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html
 */

trait SubnetRouteTableAssociation extends Resource[SubnetRouteTableAssociation] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::SubnetRouteTableAssociation"

  def routeTableId: NonEmptyProperty[String]
  def subnetId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "RouteTableId" -> routeTableId,
    "SubnetId" -> subnetId
  )
}
