package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html
 */

case class EndpointConfiguration(
    types: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Types" -> types.map(Formattable(_))
  )
}
