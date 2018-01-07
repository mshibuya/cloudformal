package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html
 */

trait Version extends Resource {
  val resourceTypeName = "AWS::Lambda::Version"

  def versionAttribute: Expression[String] = Fn.GetAtt(logicalId, "Version")

  def codeSha256: Property[String] = Empty
  def description: Property[String] = Empty
  def functionName: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CodeSha256" -> codeSha256,
    "Description" -> description,
    "FunctionName" -> functionName
  )
}
