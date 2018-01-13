package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-clientcertificate.html
 */

trait ClientCertificate extends model.Resource with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::ClientCertificate"

  def description: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description
  )
}
