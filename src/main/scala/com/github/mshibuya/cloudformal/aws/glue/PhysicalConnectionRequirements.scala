package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html
 */

case class PhysicalConnectionRequirements(
    availabilityZone: Option[String] = None,
    securityGroupIdList: Option[Seq[String]] = None,
    subnetId: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AvailabilityZone" -> availabilityZone.map(Formattable(_)),
    "SecurityGroupIdList" -> securityGroupIdList.map(Formattable(_)),
    "SubnetId" -> subnetId.map(Formattable(_))
  )
}
