package com.github.mshibuya.cloudformal.aws.elasticsearch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html
 */

case class VPCOptions(
    securityGroupIds: Property[Seq[String]] = Empty,
    subnetIds: Property[Seq[String]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "SecurityGroupIds" -> securityGroupIds,
    "SubnetIds" -> subnetIds
  )
}
