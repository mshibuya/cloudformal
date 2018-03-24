package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html
 */

trait Resource extends model.Resource[Resource] with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::Resource"

  def parentId: NonEmptyProperty[String]
  def pathPart: NonEmptyProperty[String]
  def restApiId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "ParentId" -> parentId,
    "PathPart" -> pathPart,
    "RestApiId" -> restApiId
  )
}
