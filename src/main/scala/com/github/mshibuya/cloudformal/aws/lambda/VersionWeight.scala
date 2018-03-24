package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html
 */

case class VersionWeight(
    functionVersion: NonEmptyProperty[String],
    functionWeight: NonEmptyProperty[Double]) extends Expression[VersionWeight] {
  def render: Formattable = Value(
    "FunctionVersion" -> functionVersion,
    "FunctionWeight" -> functionWeight
  )
}
