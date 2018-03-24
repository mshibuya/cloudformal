package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html
 */

case class VpcConfig(
    securityGroupIds: NonEmptyProperty[Seq[String]],
    subnetIds: NonEmptyProperty[Seq[String]]) extends Expression[VpcConfig] {
  def render: Formattable = Value(
    "SecurityGroupIds" -> securityGroupIds,
    "SubnetIds" -> subnetIds
  )
}
