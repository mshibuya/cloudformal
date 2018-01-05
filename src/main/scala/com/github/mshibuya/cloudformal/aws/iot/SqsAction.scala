package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html
 */

case class SqsAction(
    queueUrl: String,
    roleArn: String,
    useBase64: Option[Boolean] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "QueueUrl" -> Some(Formattable(queueUrl)),
    "RoleArn" -> Some(Formattable(roleArn)),
    "UseBase64" -> useBase64.map(Formattable(_))
  )
}
