package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html
 */

trait Deployment extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::Deployment"

  def description: Option[String] = None
  def restApiId: String
  def stageDescription: Option[StageDescription] = None
  def stageName: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "RestApiId" -> Some(Formattable(restApiId)),
    "StageDescription" -> stageDescription.map(Formattable(_)),
    "StageName" -> stageName.map(Formattable(_))
  )
}
