package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html
 */

case class SpotPlacement(
    availabilityZone: Option[String] = None,
    groupName: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AvailabilityZone" -> availabilityZone.map(Formattable(_)),
    "GroupName" -> groupName.map(Formattable(_))
  )
}
