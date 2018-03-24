package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html
 */

case class SpotFleetMonitoring(
    enabled: Property[Boolean] = Empty) extends Expression[SpotFleetMonitoring] {
  def render: Formattable = Value(
    "Enabled" -> enabled
  )
}
