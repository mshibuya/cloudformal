package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html
 */

case class ProcessorParameter(
    parameterName: NonEmptyProperty[String],
    parameterValue: NonEmptyProperty[String]) extends Expression[ProcessorParameter] {
  def render: Formattable = Value(
    "ParameterName" -> parameterName,
    "ParameterValue" -> parameterValue
  )
}
