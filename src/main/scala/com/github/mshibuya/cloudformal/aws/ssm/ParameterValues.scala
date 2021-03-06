package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-parametervalues.html
 */

case class ParameterValues(
    parameterValues: NonEmptyProperty[Seq[String]]) extends Expression[ParameterValues] {
  def render: Formattable = Value(
    "ParameterValues" -> parameterValues
  )
}
