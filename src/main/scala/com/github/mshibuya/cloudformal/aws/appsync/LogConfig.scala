package com.github.mshibuya.cloudformal.aws.appsync

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html
 */

case class LogConfig(
    cloudWatchLogsRoleArn: Property[String] = Empty,
    fieldLogLevel: Property[String] = Empty) extends Expression[LogConfig] {
  def render: Formattable = Value(
    "CloudWatchLogsRoleArn" -> cloudWatchLogsRoleArn,
    "FieldLogLevel" -> fieldLogLevel
  )
}
