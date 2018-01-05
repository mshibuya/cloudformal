package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html
 */

case class VpcConfig(
    securityGroupIds: Seq[String],
    subnetIds: Seq[String]) extends Renderable {
  def render: Formattable = Formattable.opt(
    "SecurityGroupIds" -> Some(Formattable(securityGroupIds)),
    "SubnetIds" -> Some(Formattable(subnetIds))
  )
}
