package com.github.mshibuya.cloudformal.aws.apigateway

import argonaut.Json
import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html
 */

trait Model extends model.Resource with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::Model"

  def contentType: Property[String] = Empty
  def description: Property[String] = Empty
  def name: Property[String] = Empty
  def restApiId: NonEmptyProperty[String]
  def schema: Property[Json] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ContentType" -> contentType,
    "Description" -> description,
    "Name" -> name,
    "RestApiId" -> restApiId,
    "Schema" -> schema
  )
}
