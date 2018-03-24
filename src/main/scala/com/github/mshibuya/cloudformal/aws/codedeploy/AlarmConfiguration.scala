package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html
 */

case class AlarmConfiguration(
    alarms: Property[Seq[Alarm]] = Empty,
    enabled: Property[Boolean] = Empty,
    ignorePollAlarmFailure: Property[Boolean] = Empty) extends Expression[AlarmConfiguration] {
  def render: Formattable = Value(
    "Alarms" -> alarms,
    "Enabled" -> enabled,
    "IgnorePollAlarmFailure" -> ignorePollAlarmFailure
  )
}
