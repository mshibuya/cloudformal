package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html
 */

case class CloudwatchAlarmAction(
    alarmName: NonEmptyProperty[String],
    roleArn: NonEmptyProperty[String],
    stateReason: NonEmptyProperty[String],
    stateValue: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AlarmName" -> alarmName,
    "RoleArn" -> roleArn,
    "StateReason" -> stateReason,
    "StateValue" -> stateValue
  )
}
