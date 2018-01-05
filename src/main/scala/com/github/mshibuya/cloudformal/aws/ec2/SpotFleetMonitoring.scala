package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html
 */

case class SpotFleetMonitoring(
    enabled: Option[Boolean] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Enabled" -> enabled.map(Formattable(_))
  )
}
