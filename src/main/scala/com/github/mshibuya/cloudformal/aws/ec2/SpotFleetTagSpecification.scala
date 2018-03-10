package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-tagspecifications.html
 */

case class SpotFleetTagSpecification(
    resourceType: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ResourceType" -> resourceType
  )
}
