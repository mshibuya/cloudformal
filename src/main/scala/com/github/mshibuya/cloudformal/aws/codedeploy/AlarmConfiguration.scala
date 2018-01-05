package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html
 */

case class AlarmConfiguration(
    alarms: Option[Seq[Alarm]] = None,
    enabled: Option[Boolean] = None,
    ignorePollAlarmFailure: Option[Boolean] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Alarms" -> alarms.map(Formattable(_)),
    "Enabled" -> enabled.map(Formattable(_)),
    "IgnorePollAlarmFailure" -> ignorePollAlarmFailure.map(Formattable(_))
  )
}
