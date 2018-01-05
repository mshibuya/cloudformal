package com.github.mshibuya.cloudformal.aws.ec2

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html
 */

trait VPCEndpoint extends Resource {
  val resourceTypeName = "AWS::EC2::VPCEndpoint"

  def policyDocument: Option[Json] = None
  def routeTableIds: Option[Seq[String]] = None
  def serviceName: String
  def vpcId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "PolicyDocument" -> policyDocument.map(Formattable(_)),
    "RouteTableIds" -> routeTableIds.map(Formattable(_)),
    "ServiceName" -> Some(Formattable(serviceName)),
    "VpcId" -> Some(Formattable(vpcId))
  )
}
