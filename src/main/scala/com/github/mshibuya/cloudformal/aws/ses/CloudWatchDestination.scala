package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html
 */

case class CloudWatchDestination(
    dimensionConfigurations: Property[Seq[DimensionConfiguration]] = Empty) extends Expression[CloudWatchDestination] {
  def render: Formattable = Value(
    "DimensionConfigurations" -> dimensionConfigurations
  )
}
