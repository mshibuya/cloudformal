package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html
 */

trait Account extends model.Resource[Account] with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::Account"

  def cloudWatchRoleArn: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "CloudWatchRoleArn" -> cloudWatchRoleArn
  )
}
