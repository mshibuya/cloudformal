package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html
 */

trait DocumentationVersion extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::DocumentationVersion"

  def description: Property[String] = Empty
  def documentationVersion: NonEmptyProperty[String]
  def restApiId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "DocumentationVersion" -> documentationVersion,
    "RestApiId" -> restApiId
  )
}
