package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html
 */

trait DocumentationVersion extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::DocumentationVersion"

  def description: Option[String] = None
  def documentationVersion: String
  def restApiId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "DocumentationVersion" -> Some(Formattable(documentationVersion)),
    "RestApiId" -> Some(Formattable(restApiId))
  )
}
