package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html
 */

case class InputProcessingConfiguration(
    inputLambdaProcessor: Option[InputLambdaProcessor] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "InputLambdaProcessor" -> inputLambdaProcessor.map(Formattable(_))
  )
}
