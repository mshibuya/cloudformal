package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html
 */

trait Resource extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::Resource"

  def parentId: NonEmptyProperty[String]
  def pathPart: NonEmptyProperty[String]
  def restApiId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ParentId" -> parentId,
    "PathPart" -> pathPart,
    "RestApiId" -> restApiId
  )
}
