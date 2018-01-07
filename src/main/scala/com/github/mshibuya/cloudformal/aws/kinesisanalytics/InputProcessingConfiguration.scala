package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html
 */

case class InputProcessingConfiguration(
    inputLambdaProcessor: Property[InputLambdaProcessor] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "InputLambdaProcessor" -> inputLambdaProcessor
  )
}
