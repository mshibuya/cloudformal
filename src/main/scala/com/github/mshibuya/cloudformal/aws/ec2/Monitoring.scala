package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-monitoring.html
 */

case class Monitoring(
    enabled: Property[Boolean] = Empty) extends Expression[Monitoring] {
  def render: Formattable = Value(
    "Enabled" -> enabled
  )
}
