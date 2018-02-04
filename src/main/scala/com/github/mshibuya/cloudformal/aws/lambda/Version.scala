package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html
 */

trait Version extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Lambda::Version"

  object attributes {
    val version: Expression[String] = Fn.GetAtt(logicalId, "Version")
  }

  def codeSha256: Property[String] = Empty
  def description: Property[String] = Empty
  def functionName: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CodeSha256" -> codeSha256,
    "Description" -> description,
    "FunctionName" -> functionName
  )
}
