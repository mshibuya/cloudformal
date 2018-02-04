package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
 */

case class DynamoDBAction(
    hashKeyField: NonEmptyProperty[String],
    hashKeyType: Property[String] = Empty,
    hashKeyValue: NonEmptyProperty[String],
    payloadField: Property[String] = Empty,
    rangeKeyField: Property[String] = Empty,
    rangeKeyType: Property[String] = Empty,
    rangeKeyValue: Property[String] = Empty,
    roleArn: NonEmptyProperty[String],
    tableName: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "HashKeyField" -> hashKeyField,
    "HashKeyType" -> hashKeyType,
    "HashKeyValue" -> hashKeyValue,
    "PayloadField" -> payloadField,
    "RangeKeyField" -> rangeKeyField,
    "RangeKeyType" -> rangeKeyType,
    "RangeKeyValue" -> rangeKeyValue,
    "RoleArn" -> roleArn,
    "TableName" -> tableName
  )
}
