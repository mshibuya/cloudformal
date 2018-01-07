package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html
 */

case class EndpointConfiguration(
    types: Property[Seq[String]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Types" -> types
  )
}
