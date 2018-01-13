package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html
 */

trait BasePathMapping extends model.Resource with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::BasePathMapping"

  def basePath: Property[String] = Empty
  def domainName: NonEmptyProperty[String]
  def restApiId: Property[String] = Empty
  def stage: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "BasePath" -> basePath,
    "DomainName" -> domainName,
    "RestApiId" -> restApiId,
    "Stage" -> stage
  )
}
