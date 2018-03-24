package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html
 */

case class LambdaAction(
    functionArn: NonEmptyProperty[String],
    topicArn: Property[String] = Empty,
    invocationType: Property[String] = Empty) extends Expression[LambdaAction] {
  def render: Formattable = Value(
    "FunctionArn" -> functionArn,
    "TopicArn" -> topicArn,
    "InvocationType" -> invocationType
  )
}
