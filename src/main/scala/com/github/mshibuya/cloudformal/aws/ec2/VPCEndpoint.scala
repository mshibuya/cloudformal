package com.github.mshibuya.cloudformal.aws.ec2

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html
 */

trait VPCEndpoint extends Resource {
  val resourceTypeName = "AWS::EC2::VPCEndpoint"

  def policyDocument: Property[Json] = Empty
  def routeTableIds: Property[Seq[String]] = Empty
  def serviceName: NonEmptyProperty[String]
  def vpcId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "PolicyDocument" -> policyDocument,
    "RouteTableIds" -> routeTableIds,
    "ServiceName" -> serviceName,
    "VpcId" -> vpcId
  )
}
