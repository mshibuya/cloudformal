package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html
 */

trait Certificate extends Resource[Certificate] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::DMS::Certificate"

  def certificateIdentifier: Property[String] = Empty
  def certificatePem: Property[String] = Empty
  def certificateWallet: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "CertificateIdentifier" -> certificateIdentifier,
    "CertificatePem" -> certificatePem,
    "CertificateWallet" -> certificateWallet
  )
}
