package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
 */

case class RepublishAction(
    roleArn: NonEmptyProperty[String],
    topic: NonEmptyProperty[String]) extends Expression[RepublishAction] {
  def render: Formattable = Value(
    "RoleArn" -> roleArn,
    "Topic" -> topic
  )
}
