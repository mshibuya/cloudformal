package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html
 */

case class VPC(
    vPCId: NonEmptyProperty[String],
    vPCRegion: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "VPCId" -> vPCId,
    "VPCRegion" -> vPCRegion
  )
}
