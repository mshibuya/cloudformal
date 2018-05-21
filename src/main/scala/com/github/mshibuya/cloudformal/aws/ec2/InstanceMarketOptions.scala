package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html
 */

case class InstanceMarketOptions(
    spotOptions: Property[SpotOptions] = Empty,
    marketType: Property[String] = Empty) extends Expression[InstanceMarketOptions] {
  def render: Formattable = Value(
    "SpotOptions" -> spotOptions,
    "MarketType" -> marketType
  )
}
