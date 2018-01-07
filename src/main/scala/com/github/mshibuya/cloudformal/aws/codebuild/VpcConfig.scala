package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html
 */

case class VpcConfig(
    subnets: NonEmptyProperty[Seq[String]],
    vpcId: NonEmptyProperty[String],
    securityGroupIds: NonEmptyProperty[Seq[String]]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Subnets" -> subnets,
    "VpcId" -> vpcId,
    "SecurityGroupIds" -> securityGroupIds
  )
}
