package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html
 */

trait Function extends Resource {
  val resourceTypeName = "AWS::Lambda::Function"

  def code: Code
  def deadLetterConfig: Option[DeadLetterConfig] = None
  def description: Option[String] = None
  def environment: Option[Environment] = None
  def functionName: Option[String] = None
  def handler: String
  def kmsKeyArn: Option[String] = None
  def memorySize: Option[Int] = None
  def role: String
  def runtime: String
  def tags: Option[Seq[Tag]] = None
  def timeout: Option[Int] = None
  def tracingConfig: Option[TracingConfig] = None
  def vpcConfig: Option[VpcConfig] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Code" -> Some(Formattable(code)),
    "DeadLetterConfig" -> deadLetterConfig.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "Environment" -> environment.map(Formattable(_)),
    "FunctionName" -> functionName.map(Formattable(_)),
    "Handler" -> Some(Formattable(handler)),
    "KmsKeyArn" -> kmsKeyArn.map(Formattable(_)),
    "MemorySize" -> memorySize.map(Formattable(_)),
    "Role" -> Some(Formattable(role)),
    "Runtime" -> Some(Formattable(runtime)),
    "Tags" -> tags.map(Formattable(_)),
    "Timeout" -> timeout.map(Formattable(_)),
    "TracingConfig" -> tracingConfig.map(Formattable(_)),
    "VpcConfig" -> vpcConfig.map(Formattable(_))
  )
}
