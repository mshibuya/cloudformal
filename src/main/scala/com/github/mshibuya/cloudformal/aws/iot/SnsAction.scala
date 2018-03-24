package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html
 */

case class SnsAction(
    messageFormat: Property[String] = Empty,
    roleArn: NonEmptyProperty[String],
    targetArn: NonEmptyProperty[String]) extends Expression[SnsAction] {
  def render: Formattable = Value(
    "MessageFormat" -> messageFormat,
    "RoleArn" -> roleArn,
    "TargetArn" -> targetArn
  )
}
