package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
 */

case class DynamoDBv2Action(
    putItem: Property[PutItemInput] = Empty,
    roleArn: Property[String] = Empty) extends Expression[DynamoDBv2Action] {
  def render: Formattable = Value(
    "PutItem" -> putItem,
    "RoleArn" -> roleArn
  )
}
