package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html
 */

case class SqsAction(
    queueUrl: NonEmptyProperty[String],
    roleArn: NonEmptyProperty[String],
    useBase64: Property[Boolean] = Empty) extends Expression[SqsAction] {
  def render: Formattable = Value(
    "QueueUrl" -> queueUrl,
    "RoleArn" -> roleArn,
    "UseBase64" -> useBase64
  )
}
