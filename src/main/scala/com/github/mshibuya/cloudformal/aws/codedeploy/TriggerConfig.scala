package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html
 */

case class TriggerConfig(
    triggerEvents: Option[Seq[String]] = None,
    triggerName: Option[String] = None,
    triggerTargetArn: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "TriggerEvents" -> triggerEvents.map(Formattable(_)),
    "TriggerName" -> triggerName.map(Formattable(_)),
    "TriggerTargetArn" -> triggerTargetArn.map(Formattable(_))
  )
}
