package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html
 */

case class SnsAction(
    messageFormat: Option[String] = None,
    roleArn: String,
    targetArn: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MessageFormat" -> messageFormat.map(Formattable(_)),
    "RoleArn" -> Some(Formattable(roleArn)),
    "TargetArn" -> Some(Formattable(targetArn))
  )
}
