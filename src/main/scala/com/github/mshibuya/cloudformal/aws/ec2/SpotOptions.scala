package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html
 */

case class SpotOptions(
    spotInstanceType: Property[String] = Empty,
    instanceInterruptionBehavior: Property[String] = Empty,
    maxPrice: Property[String] = Empty) extends Expression[SpotOptions] {
  def render: Formattable = Value(
    "SpotInstanceType" -> spotInstanceType,
    "InstanceInterruptionBehavior" -> instanceInterruptionBehavior,
    "MaxPrice" -> maxPrice
  )
}
