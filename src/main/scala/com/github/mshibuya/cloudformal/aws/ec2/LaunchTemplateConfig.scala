package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html
 */

case class LaunchTemplateConfig(
    launchTemplateSpecification: Property[FleetLaunchTemplateSpecification] = Empty,
    overrides: Property[Seq[LaunchTemplateOverrides]] = Empty) extends Expression[LaunchTemplateConfig] {
  def render: Formattable = Value(
    "LaunchTemplateSpecification" -> launchTemplateSpecification,
    "Overrides" -> overrides
  )
}
