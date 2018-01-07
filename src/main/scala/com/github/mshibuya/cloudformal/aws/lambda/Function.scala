package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html
 */

trait Function extends Resource {
  val resourceTypeName = "AWS::Lambda::Function"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def code: NonEmptyProperty[Code]
  def deadLetterConfig: Property[DeadLetterConfig] = Empty
  def description: Property[String] = Empty
  def environment: Property[Environment] = Empty
  def functionName: Property[String] = Empty
  def handler: NonEmptyProperty[String]
  def kmsKeyArn: Property[String] = Empty
  def memorySize: Property[Int] = Empty
  def role: NonEmptyProperty[String]
  def runtime: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty
  def timeout: Property[Int] = Empty
  def tracingConfig: Property[TracingConfig] = Empty
  def vpcConfig: Property[VpcConfig] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Code" -> code,
    "DeadLetterConfig" -> deadLetterConfig,
    "Description" -> description,
    "Environment" -> environment,
    "FunctionName" -> functionName,
    "Handler" -> handler,
    "KmsKeyArn" -> kmsKeyArn,
    "MemorySize" -> memorySize,
    "Role" -> role,
    "Runtime" -> runtime,
    "Tags" -> tags,
    "Timeout" -> timeout,
    "TracingConfig" -> tracingConfig,
    "VpcConfig" -> vpcConfig
  )
}
