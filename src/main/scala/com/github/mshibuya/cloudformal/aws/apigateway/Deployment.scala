package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html
 */

trait Deployment extends model.Resource with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::Deployment"

  def description: Property[String] = Empty
  def restApiId: NonEmptyProperty[String]
  def stageDescription: Property[StageDescription] = Empty
  def stageName: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "RestApiId" -> restApiId,
    "StageDescription" -> stageDescription,
    "StageName" -> stageName
  )
}
