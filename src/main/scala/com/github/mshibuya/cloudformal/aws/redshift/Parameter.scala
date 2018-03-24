package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html
 */

case class Parameter(
    parameterName: NonEmptyProperty[String],
    parameterValue: NonEmptyProperty[String]) extends Expression[Parameter] {
  def render: Formattable = Value(
    "ParameterName" -> parameterName,
    "ParameterValue" -> parameterValue
  )
}
