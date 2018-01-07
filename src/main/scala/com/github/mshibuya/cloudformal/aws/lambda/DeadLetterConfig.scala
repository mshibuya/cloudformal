package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html
 */

case class DeadLetterConfig(
    targetArn: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "TargetArn" -> targetArn
  )
}
