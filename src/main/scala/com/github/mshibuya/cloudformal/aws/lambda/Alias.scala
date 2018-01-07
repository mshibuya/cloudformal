package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html
 */

trait Alias extends Resource {
  val resourceTypeName = "AWS::Lambda::Alias"

  def description: Property[String] = Empty
  def functionName: NonEmptyProperty[String]
  def functionVersion: NonEmptyProperty[String]
  def name: NonEmptyProperty[String]
  def routingConfig: Property[AliasRoutingConfiguration] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "FunctionName" -> functionName,
    "FunctionVersion" -> functionVersion,
    "Name" -> name,
    "RoutingConfig" -> routingConfig
  )
}
