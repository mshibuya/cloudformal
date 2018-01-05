package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html
 */

case class ElasticsearchAction(
    endpoint: String,
    id: String,
    index: String,
    roleArn: String,
    `type`: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Endpoint" -> Some(Formattable(endpoint)),
    "Id" -> Some(Formattable(id)),
    "Index" -> Some(Formattable(index)),
    "RoleArn" -> Some(Formattable(roleArn)),
    "Type" -> Some(Formattable(`type`))
  )
}
