package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html
 */

case class ElasticsearchAction(
    endpoint: NonEmptyProperty[String],
    id: NonEmptyProperty[String],
    index: NonEmptyProperty[String],
    roleArn: NonEmptyProperty[String],
    `type`: NonEmptyProperty[String]) extends Expression[ElasticsearchAction] {
  def render: Formattable = Value(
    "Endpoint" -> endpoint,
    "Id" -> id,
    "Index" -> index,
    "RoleArn" -> roleArn,
    "Type" -> `type`
  )
}
