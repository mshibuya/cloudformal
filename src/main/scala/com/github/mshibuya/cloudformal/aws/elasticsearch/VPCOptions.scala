package com.github.mshibuya.cloudformal.aws.elasticsearch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html
 */

case class VPCOptions(
    securityGroupIds: Option[Seq[String]] = None,
    subnetIds: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "SecurityGroupIds" -> securityGroupIds.map(Formattable(_)),
    "SubnetIds" -> subnetIds.map(Formattable(_))
  )
}
