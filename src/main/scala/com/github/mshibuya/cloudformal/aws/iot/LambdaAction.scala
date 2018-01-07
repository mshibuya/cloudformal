package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html
 */

case class LambdaAction(
    functionArn: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "FunctionArn" -> functionArn
  )
}
