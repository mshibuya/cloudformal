package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html
 */

case class StageKey(
    restApiId: Property[String] = Empty,
    stageName: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "RestApiId" -> restApiId,
    "StageName" -> stageName
  )
}
