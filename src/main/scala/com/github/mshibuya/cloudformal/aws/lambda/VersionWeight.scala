package com.github.mshibuya.cloudformal.aws.lambda

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html
 */

case class VersionWeight(
    functionVersion: NonEmptyProperty[String],
    functionWeight: NonEmptyProperty[Double]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "FunctionVersion" -> functionVersion,
    "FunctionWeight" -> functionWeight
  )
}
