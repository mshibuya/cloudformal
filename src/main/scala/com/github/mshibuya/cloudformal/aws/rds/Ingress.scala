package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html
 */

case class Ingress(
    cidriP: Property[String] = Empty,
    eC2SecurityGroupId: Property[String] = Empty,
    eC2SecurityGroupName: Property[String] = Empty,
    eC2SecurityGroupOwnerId: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "CIDRIP" -> cidriP,
    "EC2SecurityGroupId" -> eC2SecurityGroupId,
    "EC2SecurityGroupName" -> eC2SecurityGroupName,
    "EC2SecurityGroupOwnerId" -> eC2SecurityGroupOwnerId
  )
}
