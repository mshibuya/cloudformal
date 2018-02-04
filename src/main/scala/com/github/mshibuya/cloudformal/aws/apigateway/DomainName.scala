package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html
 */

trait DomainName extends model.Resource with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::DomainName"

  def distributionDomainNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "DistributionDomainName")
  def distributionHostedZoneIdAttribute: Expression[String] = Fn.GetAtt(logicalId, "DistributionHostedZoneId")
  def regionalDomainNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "RegionalDomainName")
  def regionalHostedZoneIdAttribute: Expression[String] = Fn.GetAtt(logicalId, "RegionalHostedZoneId")

  def certificateArn: Property[String] = Empty
  def domainName: NonEmptyProperty[String]
  def endpointConfiguration: Property[EndpointConfiguration] = Empty
  def regionalCertificateArn: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CertificateArn" -> certificateArn,
    "DomainName" -> domainName,
    "EndpointConfiguration" -> endpointConfiguration,
    "RegionalCertificateArn" -> regionalCertificateArn
  )
}
