package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html
 */

case class ProcessorParameter(
    parameterName: NonEmptyProperty[String],
    parameterValue: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ParameterName" -> parameterName,
    "ParameterValue" -> parameterValue
  )
}
