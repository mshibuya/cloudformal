package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html
 */

case class Parameter(
    parameterName: NonEmptyProperty[String],
    parameterValue: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ParameterName" -> parameterName,
    "ParameterValue" -> parameterValue
  )
}
