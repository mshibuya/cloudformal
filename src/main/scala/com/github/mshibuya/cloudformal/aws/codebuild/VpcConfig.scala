package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html
 */

case class VpcConfig(
    subnets: Seq[String],
    vpcId: String,
    securityGroupIds: Seq[String]) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Subnets" -> Some(Formattable(subnets)),
    "VpcId" -> Some(Formattable(vpcId)),
    "SecurityGroupIds" -> Some(Formattable(securityGroupIds))
  )
}
