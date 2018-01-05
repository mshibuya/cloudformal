package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html
 */

case class Location(
    method: Option[String] = None,
    name: Option[String] = None,
    path: Option[String] = None,
    statusCode: Option[String] = None,
    `type`: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Method" -> method.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "Path" -> path.map(Formattable(_)),
    "StatusCode" -> statusCode.map(Formattable(_)),
    "Type" -> `type`.map(Formattable(_))
  )
}
