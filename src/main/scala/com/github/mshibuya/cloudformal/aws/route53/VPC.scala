package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html
 */

case class VPC(
    vpcId: NonEmptyProperty[String],
    vpcRegion: NonEmptyProperty[String]) extends Expression[VPC] {
  def render: Formattable = Value(
    "VPCId" -> vpcId,
    "VPCRegion" -> vpcRegion
  )
}
