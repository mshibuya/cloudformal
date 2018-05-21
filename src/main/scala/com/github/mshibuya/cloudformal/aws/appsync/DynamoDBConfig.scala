package com.github.mshibuya.cloudformal.aws.appsync

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html
 */

case class DynamoDBConfig(
    tableName: NonEmptyProperty[String],
    awsRegion: NonEmptyProperty[String],
    useCallerCredentials: Property[Boolean] = Empty) extends Expression[DynamoDBConfig] {
  def render: Formattable = Value(
    "TableName" -> tableName,
    "AwsRegion" -> awsRegion,
    "UseCallerCredentials" -> useCallerCredentials
  )
}
