package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html
 */

case class Ingress(
    cIDRIP: Option[String] = None,
    eC2SecurityGroupId: Option[String] = None,
    eC2SecurityGroupName: Option[String] = None,
    eC2SecurityGroupOwnerId: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CIDRIP" -> cIDRIP.map(Formattable(_)),
    "EC2SecurityGroupId" -> eC2SecurityGroupId.map(Formattable(_)),
    "EC2SecurityGroupName" -> eC2SecurityGroupName.map(Formattable(_)),
    "EC2SecurityGroupOwnerId" -> eC2SecurityGroupOwnerId.map(Formattable(_))
  )
}
