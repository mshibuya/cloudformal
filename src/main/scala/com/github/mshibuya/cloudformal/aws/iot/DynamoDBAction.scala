package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
 */

case class DynamoDBAction(
    hashKeyField: String,
    hashKeyType: Option[String] = None,
    hashKeyValue: String,
    payloadField: Option[String] = None,
    rangeKeyField: String,
    rangeKeyType: Option[String] = None,
    rangeKeyValue: String,
    roleArn: String,
    tableName: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "HashKeyField" -> Some(Formattable(hashKeyField)),
    "HashKeyType" -> hashKeyType.map(Formattable(_)),
    "HashKeyValue" -> Some(Formattable(hashKeyValue)),
    "PayloadField" -> payloadField.map(Formattable(_)),
    "RangeKeyField" -> Some(Formattable(rangeKeyField)),
    "RangeKeyType" -> rangeKeyType.map(Formattable(_)),
    "RangeKeyValue" -> Some(Formattable(rangeKeyValue)),
    "RoleArn" -> Some(Formattable(roleArn)),
    "TableName" -> Some(Formattable(tableName))
  )
}
