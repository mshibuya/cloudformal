package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html
 */

trait Certificate extends Resource {
  val resourceTypeName = "AWS::DMS::Certificate"

  def certificateIdentifier: Option[String] = None
  def certificatePem: Option[String] = None
  def certificateWallet: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CertificateIdentifier" -> certificateIdentifier.map(Formattable(_)),
    "CertificatePem" -> certificatePem.map(Formattable(_)),
    "CertificateWallet" -> certificateWallet.map(Formattable(_))
  )
}
