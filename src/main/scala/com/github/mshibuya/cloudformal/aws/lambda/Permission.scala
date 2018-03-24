package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html
 */

trait Permission extends Resource[Permission] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Lambda::Permission"

  def action: NonEmptyProperty[String]
  def eventSourceToken: Property[String] = Empty
  def functionName: NonEmptyProperty[String]
  def principal: NonEmptyProperty[String]
  def sourceAccount: Property[String] = Empty
  def sourceArn: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "Action" -> action,
    "EventSourceToken" -> eventSourceToken,
    "FunctionName" -> functionName,
    "Principal" -> principal,
    "SourceAccount" -> sourceAccount,
    "SourceArn" -> sourceArn
  )
}
