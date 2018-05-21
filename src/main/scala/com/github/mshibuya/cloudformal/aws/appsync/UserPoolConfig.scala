package com.github.mshibuya.cloudformal.aws.appsync

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html
 */

case class UserPoolConfig(
    appIdClientRegex: Property[String] = Empty,
    userPoolId: Property[String] = Empty,
    awsRegion: Property[String] = Empty,
    defaultAction: Property[String] = Empty) extends Expression[UserPoolConfig] {
  def render: Formattable = Value(
    "AppIdClientRegex" -> appIdClientRegex,
    "UserPoolId" -> userPoolId,
    "AwsRegion" -> awsRegion,
    "DefaultAction" -> defaultAction
  )
}
