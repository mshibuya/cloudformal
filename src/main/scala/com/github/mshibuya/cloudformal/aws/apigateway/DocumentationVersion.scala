package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html
 */

trait DocumentationVersion extends model.Resource[DocumentationVersion] with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::DocumentationVersion"

  def description: Property[String] = Empty
  def documentationVersion: NonEmptyProperty[String]
  def restApiId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "Description" -> description,
    "DocumentationVersion" -> documentationVersion,
    "RestApiId" -> restApiId
  )
}
