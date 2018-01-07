package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
 */

case class DynamoDBv2Action(
    putItem: Property[PutItemInput] = Empty,
    roleArn: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "PutItem" -> putItem,
    "RoleArn" -> roleArn
  )
}
