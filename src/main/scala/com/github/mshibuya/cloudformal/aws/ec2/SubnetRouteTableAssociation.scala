package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html
 */

trait SubnetRouteTableAssociation extends Resource {
  val resourceTypeName = "AWS::EC2::SubnetRouteTableAssociation"

  def routeTableId: String
  def subnetId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "RouteTableId" -> Some(Formattable(routeTableId)),
    "SubnetId" -> Some(Formattable(subnetId))
  )
}
