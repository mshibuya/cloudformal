package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html
 */

trait DocumentationPart extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::DocumentationPart"

  def location: Location
  def properties: String
  def restApiId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Location" -> Some(Formattable(location)),
    "Properties" -> Some(Formattable(properties)),
    "RestApiId" -> Some(Formattable(restApiId))
  )
}
