package com.github.mshibuya.cloudformal.aws.appsync

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html
 */

trait Resolver extends Resource[Resolver] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::AppSync::Resolver"

  object attributes {
    val typeName: Expression[String] = Fn.GetAtt(logicalId, "TypeName")
    val resolverArn: Expression[String] = Fn.GetAtt(logicalId, "ResolverArn")
    val fieldName: Expression[String] = Fn.GetAtt(logicalId, "FieldName")
  }

  def responseMappingTemplateS3Location: Property[String] = Empty
  def typeName: NonEmptyProperty[String]
  def dataSourceName: NonEmptyProperty[String]
  def requestMappingTemplate: Property[String] = Empty
  def responseMappingTemplate: Property[String] = Empty
  def requestMappingTemplateS3Location: Property[String] = Empty
  def apiId: NonEmptyProperty[String]
  def fieldName: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "ResponseMappingTemplateS3Location" -> responseMappingTemplateS3Location,
    "TypeName" -> typeName,
    "DataSourceName" -> dataSourceName,
    "RequestMappingTemplate" -> requestMappingTemplate,
    "ResponseMappingTemplate" -> responseMappingTemplate,
    "RequestMappingTemplateS3Location" -> requestMappingTemplateS3Location,
    "ApiId" -> apiId,
    "FieldName" -> fieldName
  )
}
