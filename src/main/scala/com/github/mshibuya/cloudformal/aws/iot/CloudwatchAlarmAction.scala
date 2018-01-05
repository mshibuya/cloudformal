package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html
 */

case class CloudwatchAlarmAction(
    alarmName: String,
    roleArn: String,
    stateReason: String,
    stateValue: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AlarmName" -> Some(Formattable(alarmName)),
    "RoleArn" -> Some(Formattable(roleArn)),
    "StateReason" -> Some(Formattable(stateReason)),
    "StateValue" -> Some(Formattable(stateValue))
  )
}
