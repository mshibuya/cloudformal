package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html
 */

case class ViewerCertificate(
    iamCertificateId: Property[String] = Empty,
    sslSupportMethod: Property[String] = Empty,
    minimumProtocolVersion: Property[String] = Empty,
    cloudFrontDefaultCertificate: Property[Boolean] = Empty,
    acmCertificateArn: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "IamCertificateId" -> iamCertificateId,
    "SslSupportMethod" -> sslSupportMethod,
    "MinimumProtocolVersion" -> minimumProtocolVersion,
    "CloudFrontDefaultCertificate" -> cloudFrontDefaultCertificate,
    "AcmCertificateArn" -> acmCertificateArn
  )
}
