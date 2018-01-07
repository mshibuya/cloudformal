package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html
 */

case class PhysicalConnectionRequirements(
    availabilityZone: Property[String] = Empty,
    securityGroupIdList: Property[Seq[String]] = Empty,
    subnetId: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AvailabilityZone" -> availabilityZone,
    "SecurityGroupIdList" -> securityGroupIdList,
    "SubnetId" -> subnetId
  )
}
