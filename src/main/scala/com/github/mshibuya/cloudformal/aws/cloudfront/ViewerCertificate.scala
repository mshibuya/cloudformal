package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html
 */

case class ViewerCertificate(
    iamCertificateId: Option[String] = None,
    sslSupportMethod: Option[String] = None,
    minimumProtocolVersion: Option[String] = None,
    cloudFrontDefaultCertificate: Option[Boolean] = None,
    acmCertificateArn: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "IamCertificateId" -> iamCertificateId.map(Formattable(_)),
    "SslSupportMethod" -> sslSupportMethod.map(Formattable(_)),
    "MinimumProtocolVersion" -> minimumProtocolVersion.map(Formattable(_)),
    "CloudFrontDefaultCertificate" -> cloudFrontDefaultCertificate.map(Formattable(_)),
    "AcmCertificateArn" -> acmCertificateArn.map(Formattable(_))
  )
}
