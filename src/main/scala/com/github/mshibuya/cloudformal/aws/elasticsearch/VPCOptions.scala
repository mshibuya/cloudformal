package com.github.mshibuya.cloudformal.aws.elasticsearch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html
 */

case class VPCOptions(
    securityGroupIds: Property[Seq[String]] = Empty,
    subnetIds: Property[Seq[String]] = Empty) extends Expression[VPCOptions] {
  def render: Formattable = Value(
    "SecurityGroupIds" -> securityGroupIds,
    "SubnetIds" -> subnetIds
  )
}
