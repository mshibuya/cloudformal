package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html
 */

case class Location(
    method: Property[String] = Empty,
    name: Property[String] = Empty,
    path: Property[String] = Empty,
    statusCode: Property[String] = Empty,
    `type`: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Method" -> method,
    "Name" -> name,
    "Path" -> path,
    "StatusCode" -> statusCode,
    "Type" -> `type`
  )
}
