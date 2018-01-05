package com.github.mshibuya.cloudformal.aws.apigateway

import argonaut.Json
import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html
 */

trait Model extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::Model"

  def contentType: Option[String] = None
  def description: Option[String] = None
  def name: Option[String] = None
  def restApiId: String
  def schema: Option[Json] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ContentType" -> contentType.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "RestApiId" -> Some(Formattable(restApiId)),
    "Schema" -> schema.map(Formattable(_))
  )
}
