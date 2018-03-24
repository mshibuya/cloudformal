package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html
 */

case class ApiStage(
    apiId: Property[String] = Empty,
    stage: Property[String] = Empty) extends Expression[ApiStage] {
  def render: Formattable = Value(
    "ApiId" -> apiId,
    "Stage" -> stage
  )
}
