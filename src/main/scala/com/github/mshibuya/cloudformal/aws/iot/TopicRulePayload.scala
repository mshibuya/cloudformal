package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html
 */

case class TopicRulePayload(
    actions: NonEmptyProperty[Seq[Action]],
    awsIotSqlVersion: Property[String] = Empty,
    description: Property[String] = Empty,
    ruleDisabled: NonEmptyProperty[Boolean],
    sql: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Actions" -> actions,
    "AwsIotSqlVersion" -> awsIotSqlVersion,
    "Description" -> description,
    "RuleDisabled" -> ruleDisabled,
    "Sql" -> sql
  )
}
