package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html
 */

case class ProcessorParameter(
    parameterName: String,
    parameterValue: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ParameterName" -> Some(Formattable(parameterName)),
    "ParameterValue" -> Some(Formattable(parameterValue))
  )
}
