package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html
 */

trait Resource extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::Resource"

  def parentId: String
  def pathPart: String
  def restApiId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "ParentId" -> Some(Formattable(parentId)),
    "PathPart" -> Some(Formattable(pathPart)),
    "RestApiId" -> Some(Formattable(restApiId))
  )
}
