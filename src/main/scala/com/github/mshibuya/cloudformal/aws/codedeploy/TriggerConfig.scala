package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html
 */

case class TriggerConfig(
    triggerEvents: Property[Seq[String]] = Empty,
    triggerName: Property[String] = Empty,
    triggerTargetArn: Property[String] = Empty) extends Expression[TriggerConfig] {
  def render: Formattable = Value(
    "TriggerEvents" -> triggerEvents,
    "TriggerName" -> triggerName,
    "TriggerTargetArn" -> triggerTargetArn
  )
}
