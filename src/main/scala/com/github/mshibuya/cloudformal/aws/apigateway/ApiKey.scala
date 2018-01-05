package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html
 */

trait ApiKey extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::ApiKey"

  def customerId: Option[String] = None
  def description: Option[String] = None
  def enabled: Option[Boolean] = None
  def generateDistinctId: Option[Boolean] = None
  def name: Option[String] = None
  def stageKeys: Option[Seq[StageKey]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CustomerId" -> customerId.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "Enabled" -> enabled.map(Formattable(_)),
    "GenerateDistinctId" -> generateDistinctId.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "StageKeys" -> stageKeys.map(Formattable(_))
  )
}
