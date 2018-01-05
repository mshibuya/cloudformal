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

  def binaryMediaTypes: Option[Seq[String]] = None
  def body: Option[Json] = None
  def bodyS3Location: Option[S3Location] = None
  def cloneFrom: Option[String] = None
  def description: Option[String] = None
  def endpointConfiguration: Option[EndpointConfiguration] = None
  def failOnWarnings: Option[Boolean] = None
  def mode: Option[String] = None
  def name: Option[String] = None
  def parameters: Option[ListMap[String, String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "BinaryMediaTypes" -> binaryMediaTypes.map(Formattable(_)),
    "Body" -> body.map(Formattable(_)),
    "BodyS3Location" -> bodyS3Location.map(Formattable(_)),
    "CloneFrom" -> cloneFrom.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "EndpointConfiguration" -> endpointConfiguration.map(Formattable(_)),
    "FailOnWarnings" -> failOnWarnings.map(Formattable(_)),
    "Mode" -> mode.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "Parameters" -> parameters.map(Formattable(_))
  )
}
