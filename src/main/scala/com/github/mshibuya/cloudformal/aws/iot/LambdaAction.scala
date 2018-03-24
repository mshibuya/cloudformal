package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html
 */

case class LambdaAction(
    functionArn: Property[String] = Empty) extends Expression[LambdaAction] {
  def render: Formattable = Value(
    "FunctionArn" -> functionArn
  )
}
