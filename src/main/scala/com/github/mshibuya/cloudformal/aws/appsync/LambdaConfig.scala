package com.github.mshibuya.cloudformal.aws.appsync

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html
 */

case class LambdaConfig(
    lambdaFunctionArn: NonEmptyProperty[String]) extends Expression[LambdaConfig] {
  def render: Formattable = Value(
    "LambdaFunctionArn" -> lambdaFunctionArn
  )
}
