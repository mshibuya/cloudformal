package com.github.mshibuya.cloudformal.aws.appsync

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html
 */

trait ApiKey extends Resource[ApiKey] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::AppSync::ApiKey"

  object attributes {
    val apiKey: Expression[String] = Fn.GetAtt(logicalId, "ApiKey")
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def description: Property[String] = Empty
  def expires: Property[Double] = Empty
  def apiId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "Description" -> description,
    "Expires" -> expires,
    "ApiId" -> apiId
  )
}
