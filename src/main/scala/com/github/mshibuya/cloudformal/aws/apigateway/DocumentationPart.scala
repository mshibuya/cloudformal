package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html
 */

trait DocumentationPart extends model.Resource with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::DocumentationPart"

  def location: NonEmptyProperty[Location]
  def properties: NonEmptyProperty[String]
  def restApiId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Location" -> location,
    "Properties" -> properties,
    "RestApiId" -> restApiId
  )
}
