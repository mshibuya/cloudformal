package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html
 */

trait Version extends Resource {
  val resourceTypeName = "AWS::Lambda::Version"

  def codeSha256: Option[String] = None
  def description: Option[String] = None
  def functionName: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "CodeSha256" -> codeSha256.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "FunctionName" -> Some(Formattable(functionName))
  )
}
