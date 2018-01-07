package com.github.mshibuya.cloudformal.aws.apigateway

import argonaut.Json
import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html
 */

trait RestApi extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::RestApi"

  def rootResourceIdAttribute: Expression[String] = Fn.GetAtt(logicalId, "RootResourceId")

  def binaryMediaTypes: Property[Seq[String]] = Empty
  def body: Property[Json] = Empty
  def bodyS3Location: Property[S3Location] = Empty
  def cloneFrom: Property[String] = Empty
  def description: Property[String] = Empty
  def endpointConfiguration: Property[EndpointConfiguration] = Empty
  def failOnWarnings: Property[Boolean] = Empty
  def mode: Property[String] = Empty
  def name: Property[String] = Empty
  def parameters: Property[ListMap[String, String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "BinaryMediaTypes" -> binaryMediaTypes,
    "Body" -> body,
    "BodyS3Location" -> bodyS3Location,
    "CloneFrom" -> cloneFrom,
    "Description" -> description,
    "EndpointConfiguration" -> endpointConfiguration,
    "FailOnWarnings" -> failOnWarnings,
    "Mode" -> mode,
    "Name" -> name,
    "Parameters" -> parameters
  )
}
