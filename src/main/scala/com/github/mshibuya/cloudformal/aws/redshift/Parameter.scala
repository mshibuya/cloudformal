package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html
 */

case class Parameter(
    parameterName: String,
    parameterValue: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ParameterName" -> Some(Formattable(parameterName)),
    "ParameterValue" -> Some(Formattable(parameterValue))
  )
}
