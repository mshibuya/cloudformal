package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html
 */

trait Alias extends Resource {
  val resourceTypeName = "AWS::Lambda::Alias"

  def description: Option[String] = None
  def functionName: String
  def functionVersion: String
  def name: String
  def routingConfig: Option[AliasRoutingConfiguration] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "FunctionName" -> Some(Formattable(functionName)),
    "FunctionVersion" -> Some(Formattable(functionVersion)),
    "Name" -> Some(Formattable(name)),
    "RoutingConfig" -> routingConfig.map(Formattable(_))
  )
}
