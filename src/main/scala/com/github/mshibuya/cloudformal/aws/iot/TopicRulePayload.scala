package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html
 */

case class TopicRulePayload(
    actions: Seq[Action],
    awsIotSqlVersion: Option[String] = None,
    description: Option[String] = None,
    ruleDisabled: Boolean,
    sql: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Actions" -> Some(Formattable(actions)),
    "AwsIotSqlVersion" -> awsIotSqlVersion.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "RuleDisabled" -> Some(Formattable(ruleDisabled)),
    "Sql" -> Some(Formattable(sql))
  )
}
