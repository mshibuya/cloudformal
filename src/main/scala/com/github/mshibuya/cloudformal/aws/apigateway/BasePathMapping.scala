package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html
 */

trait BasePathMapping extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::BasePathMapping"

  def basePath: Option[String] = None
  def domainName: String
  def restApiId: Option[String] = None
  def stage: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "BasePath" -> basePath.map(Formattable(_)),
    "DomainName" -> Some(Formattable(domainName)),
    "RestApiId" -> restApiId.map(Formattable(_)),
    "Stage" -> stage.map(Formattable(_))
  )
}
