package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
 */

case class DynamoDBv2Action(
    putItem: Option[PutItemInput] = None,
    roleArn: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "PutItem" -> putItem.map(Formattable(_)),
    "RoleArn" -> roleArn.map(Formattable(_))
  )
}
