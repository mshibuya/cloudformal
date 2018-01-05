package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-clientcertificate.html
 */

trait ClientCertificate extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::ClientCertificate"

  def description: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_))
  )
}
