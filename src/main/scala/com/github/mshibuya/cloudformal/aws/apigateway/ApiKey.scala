package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html
 */

trait ApiKey extends model.Resource[ApiKey] with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::ApiKey"

  def customerId: Property[String] = Empty
  def description: Property[String] = Empty
  def enabled: Property[Boolean] = Empty
  def generateDistinctId: Property[Boolean] = Empty
  def name: Property[String] = Empty
  def stageKeys: Property[Seq[StageKey]] = Empty

  def render(): MapValue[_] = Value(
    "CustomerId" -> customerId,
    "Description" -> description,
    "Enabled" -> enabled,
    "GenerateDistinctId" -> generateDistinctId,
    "Name" -> name,
    "StageKeys" -> stageKeys
  )
}
