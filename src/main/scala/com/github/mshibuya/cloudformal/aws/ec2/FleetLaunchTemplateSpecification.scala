package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
 */

case class FleetLaunchTemplateSpecification(
    launchTemplateId: Property[String] = Empty,
    launchTemplateName: Property[String] = Empty,
    version: Property[String] = Empty) extends Expression[FleetLaunchTemplateSpecification] {
  def render: Formattable = Value(
    "LaunchTemplateId" -> launchTemplateId,
    "LaunchTemplateName" -> launchTemplateName,
    "Version" -> version
  )
}
