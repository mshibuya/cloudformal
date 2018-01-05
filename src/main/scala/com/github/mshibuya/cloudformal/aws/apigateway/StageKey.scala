package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html
 */

case class StageKey(
    restApiId: Option[String] = None,
    stageName: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "RestApiId" -> restApiId.map(Formattable(_)),
    "StageName" -> stageName.map(Formattable(_))
  )
}
