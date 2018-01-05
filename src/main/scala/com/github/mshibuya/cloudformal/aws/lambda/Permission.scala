package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html
 */

trait Permission extends Resource {
  val resourceTypeName = "AWS::Lambda::Permission"

  def action: String
  def eventSourceToken: Option[String] = None
  def functionName: String
  def principal: String
  def sourceAccount: Option[String] = None
  def sourceArn: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Action" -> Some(Formattable(action)),
    "EventSourceToken" -> eventSourceToken.map(Formattable(_)),
    "FunctionName" -> Some(Formattable(functionName)),
    "Principal" -> Some(Formattable(principal)),
    "SourceAccount" -> sourceAccount.map(Formattable(_)),
    "SourceArn" -> sourceArn.map(Formattable(_))
  )
}
