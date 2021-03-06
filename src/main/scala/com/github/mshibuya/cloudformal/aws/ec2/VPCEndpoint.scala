package com.github.mshibuya.cloudformal.aws.ec2

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html
 */

trait VPCEndpoint extends Resource[VPCEndpoint] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::VPCEndpoint"

  def policyDocument: Property[Json] = Empty
  def routeTableIds: Property[Seq[String]] = Empty
  def serviceName: NonEmptyProperty[String]
  def vpcId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "PolicyDocument" -> policyDocument,
    "RouteTableIds" -> routeTableIds,
    "ServiceName" -> serviceName,
    "VpcId" -> vpcId
  )
}
