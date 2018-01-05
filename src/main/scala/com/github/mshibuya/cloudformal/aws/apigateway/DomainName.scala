package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html
 */

trait DomainName extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::DomainName"

  def certificateArn: Option[String] = None
  def domainName: String
  def endpointConfiguration: Option[EndpointConfiguration] = None
  def regionalCertificateArn: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CertificateArn" -> certificateArn.map(Formattable(_)),
    "DomainName" -> Some(Formattable(domainName)),
    "EndpointConfiguration" -> endpointConfiguration.map(Formattable(_)),
    "RegionalCertificateArn" -> regionalCertificateArn.map(Formattable(_))
  )
}
