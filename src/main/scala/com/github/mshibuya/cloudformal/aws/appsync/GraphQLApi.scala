package com.github.mshibuya.cloudformal.aws.appsync

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html
 */

trait GraphQLApi extends Resource[GraphQLApi] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::AppSync::GraphQLApi"

  object attributes {
    val graphQLUrl: Expression[String] = Fn.GetAtt(logicalId, "GraphQLUrl")
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
    val apiId: Expression[String] = Fn.GetAtt(logicalId, "ApiId")
  }

  def openIDConnectConfig: Property[OpenIDConnectConfig] = Empty
  def userPoolConfig: Property[UserPoolConfig] = Empty
  def name: NonEmptyProperty[String]
  def authenticationType: NonEmptyProperty[String]
  def logConfig: Property[LogConfig] = Empty

  def render(): MapValue[_] = Value(
    "OpenIDConnectConfig" -> openIDConnectConfig,
    "UserPoolConfig" -> userPoolConfig,
    "Name" -> name,
    "AuthenticationType" -> authenticationType,
    "LogConfig" -> logConfig
  )
}
