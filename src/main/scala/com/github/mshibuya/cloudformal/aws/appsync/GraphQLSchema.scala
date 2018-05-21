package com.github.mshibuya.cloudformal.aws.appsync

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html
 */

trait GraphQLSchema extends Resource[GraphQLSchema] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::AppSync::GraphQLSchema"

  def definition: Property[String] = Empty
  def definitionS3Location: Property[String] = Empty
  def apiId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "Definition" -> definition,
    "DefinitionS3Location" -> definitionS3Location,
    "ApiId" -> apiId
  )
}
