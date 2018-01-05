package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html
 */

case class ApiStage(
    apiId: Option[String] = None,
    stage: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ApiId" -> apiId.map(Formattable(_)),
    "Stage" -> stage.map(Formattable(_))
  )
}
