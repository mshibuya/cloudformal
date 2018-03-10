package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html
 */

case class CloudWatchDestination(
    dimensionConfigurations: Property[Seq[DimensionConfiguration]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DimensionConfigurations" -> dimensionConfigurations
  )
}
