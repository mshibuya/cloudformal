package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html
 */

case class DimensionConfiguration(
    dimensionValueSource: NonEmptyProperty[String],
    defaultDimensionValue: NonEmptyProperty[String],
    dimensionName: NonEmptyProperty[String]) extends Expression[DimensionConfiguration] {
  def render: Formattable = Value(
    "DimensionValueSource" -> dimensionValueSource,
    "DefaultDimensionValue" -> defaultDimensionValue,
    "DimensionName" -> dimensionName
  )
}
